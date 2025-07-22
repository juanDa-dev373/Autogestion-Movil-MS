package co.api.couch.model.common.exception;

import lombok.Getter;

@Getter
public class ValidationException extends RuntimeException {
  private final Integer code;

  public ValidationException(String message, Integer code) {
    super(message);
    this.code = code;
  }
}
