package io.postcodes.client;

public interface PostCodesClient {

  PostCode get(String postCode);

  boolean isValid(String postCode);

  Iterable<PostCodeWithDistance> nearest(String postCode);
}
