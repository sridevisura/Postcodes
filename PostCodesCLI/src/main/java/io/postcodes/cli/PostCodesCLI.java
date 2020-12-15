package io.postcodes.cli;

import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.toList;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.common.collect.ImmutableList;
import io.postcodes.client.*;
import io.postcodes.json.ObjectMapperProvider;
import java.util.List;
import java.util.stream.StreamSupport;
import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Help.Ansi;
import picocli.CommandLine.Parameters;

@Command(name = "postcodes")
public class PostCodesCLI implements Runnable {

  private final PostCodesClient client;

  @Parameters(index = "0")
  String postCodeParam;

  PostCodesCLI(PostCodesClient client) {
    this.client = client;
  }

  @Override
  public void run() {
    intro();
    provided();

    final boolean isValid = validation();
    if (isValid) {
      final PostCode postCode = information();
      nearest(postCode);
    }
  }

  private void intro() {
    println("@|bold,blue PostCodes CLI v1.0|@");
  }

  private void provided() {
    System.out.println();
    println("• Provided postcode: @|bold,green %s|@", postCodeParam);
  }

  private boolean validation() {
    System.out.println();
    println("@|yellow ℹ Please wait while we validate the postcode!|@");
    if (client.isValid(postCodeParam)) {
      println("@|bold,green ✔ The postcode '%s' is valid!|@", postCodeParam);
      return true;
    } else {
      println("@|bold,red ❌ The postcode '%s' is invalid!|@", postCodeParam);
      return false;
    }
  }

  private PostCode information() {
    System.out.println();
    println("@|yellow ℹ Please wait while we get more information!|@");
    final PostCode postCodeInfo = client.get(postCodeParam);
    println("• Postcode : @|bold,green %s|@", postCodeInfo.postcode());
    println("• Country  : @|bold,green %s|@", postCodeInfo.country());
    println("• Region   : @|bold,green %s|@", postCodeInfo.region());
    return postCodeInfo;
  }

  private void nearest(PostCode postCode) {
    System.out.println();
    println("@|yellow ℹ Please wait while we get nearest postcodes!|@");
    final Iterable<PostCodeWithDistance> nearestPostCodes = client.nearest(postCode.postcode());

    final List<PostCodeWithDistance> nearestPostCodesWithoutSelf =
        removeThisFromNearestPostCodes(postCode, nearestPostCodes);
    if (nearestPostCodesWithoutSelf.isEmpty()) {
      println("@|bold,red ❌ No nearest postcode has been found!|@");
    } else {
      println("@|bold,green ✔ Found '%d' nearest postcodes!|@", nearestPostCodesWithoutSelf.size());
    }

    for (int i = 0; i < nearestPostCodesWithoutSelf.size(); i++) {
      final PostCodeWithDistance nearestPostCode = nearestPostCodesWithoutSelf.get(i);
      System.out.println();
      println("@|bold,underline %d:|@", i + 1);
      println("• Postcode : @|bold,green %s|@", nearestPostCode.postcode());
      println("• Country  : @|bold,green %s|@", nearestPostCode.country());
      println("• Region   : @|bold,green %s|@", nearestPostCode.region());
      println("• Distance : @|bold,green %s meters|@", nearestPostCode.distance());
    }
  }

  private List<PostCodeWithDistance> removeThisFromNearestPostCodes(
      PostCode postCode, Iterable<PostCodeWithDistance> nearestPostCodes) {
    return StreamSupport.stream(nearestPostCodes.spliterator(), false)
        .filter(p -> !p.postcode().equals(postCode.postcode()))
        .sorted(new PostCodeWithDistanceComparator())
        .collect(collectingAndThen(toList(), ImmutableList::copyOf));
  }

  private void println(String content) {
    System.out.println(Ansi.AUTO.string(content));
  }

  private void println(String content, Object... args) {
    System.out.println(Ansi.AUTO.string(String.format(content, args)));
  }

  public static void main(String[] args) {
    final HttpRequestFactory requestFactory = new NetHttpTransport().createRequestFactory();
    final ObjectMapper mapper = ObjectMapperProvider.get();
    final PostCodesClient client = new PostCodesRestClient(requestFactory, mapper);
    final PostCodesCLI cli = new PostCodesCLI(client);
    int exitCode =
        new CommandLine(cli)
            .setExecutionExceptionHandler(new PrintExceptionMessageHandler())
            .execute(args);
    System.exit(exitCode);
  }
}
