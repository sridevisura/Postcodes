package io.postcodes.client;

public class PostCodesClientException extends RuntimeException {

  PostCodesClientException(String message) {
    super(message);
  }

  PostCodesClientException(Throwable throwable) {
    super(throwable);
  }

  PostCodesClientException(String message, Throwable throwable) {
    super(message, throwable);
  }
}
