package io.postcodes.client;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.HttpStatusCodes;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class PostCodesRestClient implements PostCodesClient {

  private static final String URL = "https://api.postcodes.io/postcodes/";

  private static final String ERROR_MESSAGE_TEMPLATE =
      "Request with URL '%s' failed with status code: '%s'";

  private final HttpRequestFactory requestFactory;

  private final ObjectMapper mapper;

  public PostCodesRestClient(HttpRequestFactory requestFactory, ObjectMapper mapper) {
    this.requestFactory = requestFactory;
    this.mapper = mapper;
  }

  @Override
  public PostCode get(String postCode) {
    try {
      final String encodedPostCode = encodePathSegment(postCode);
      final String encodedUrl = URL + encodedPostCode;
      final GenericUrl genericUrl = new GenericUrl(encodedUrl);
      final HttpRequest request = requestFactory.buildGetRequest(genericUrl);
      final String rawResponse = request.execute().parseAsString();
      final PostCodeResponse response = mapper.readValue(rawResponse, PostCodeResponse.class);
      if (response.status() == HttpStatusCodes.STATUS_CODE_OK) {
        return response.result();
      } else {
        throw new IOException(String.format(ERROR_MESSAGE_TEMPLATE, encodedUrl, response.status()));
      }
    } catch (Exception e) {
      throw new PostCodesClientException("Failed to get information of postcode: " + postCode, e);
    }
  }

  @Override
  public boolean isValid(String postCode) {
    try {
      final String encodedPostCode = encodePathSegment(postCode);
      final String encodedUrl = URL + encodedPostCode + "/validate";
      final GenericUrl genericUrl = new GenericUrl(encodedUrl);
      final HttpRequest request = requestFactory.buildGetRequest(genericUrl);
      final String rawResponse = request.execute().parseAsString();
      final ValidateResponse response = mapper.readValue(rawResponse, ValidateResponse.class);
      if (response.status() == HttpStatusCodes.STATUS_CODE_OK) {
        return response.result();
      } else {
        throw new IOException(String.format(ERROR_MESSAGE_TEMPLATE, encodedUrl, response.status()));
      }
    } catch (Exception e) {
      throw new PostCodesClientException("Failed to validate postcode: " + postCode, e);
    }
  }

  @Override
  public Iterable<PostCodeWithDistance> nearest(String postCode) {
    try {
      final String encodedPostCode = encodePathSegment(postCode);
      final String encodedUrl = URL + encodedPostCode + "/nearest";
      final GenericUrl genericUrl = new GenericUrl(encodedUrl);
      final HttpRequest request = requestFactory.buildGetRequest(genericUrl);
      final String rawResponse = request.execute().parseAsString();
      final NearestResponse response = mapper.readValue(rawResponse, NearestResponse.class);
      if (response.status() == HttpStatusCodes.STATUS_CODE_OK) {
        return response.result();
      } else {
        throw new IOException(String.format(ERROR_MESSAGE_TEMPLATE, encodedUrl, response.status()));
      }
    } catch (Exception e) {
      throw new PostCodesClientException(
          "Failed to get nearest postcodes of postcode: " + postCode, e);
    }
  }

  private String encodePathSegment(String segment) throws UnsupportedEncodingException {
    return URLEncoder.encode(segment, StandardCharsets.UTF_8.toString()).replace("+", "%20");
  }
}
