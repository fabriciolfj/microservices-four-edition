package se.magnus.util.http;

import org.springframework.http.HttpStatus;

import java.time.ZonedDateTime;

public class HttpErrorInfo {
  private ZonedDateTime timestamp;
  private String path;
  private HttpStatus httpStatus;
  private String message;

  public HttpErrorInfo() {
    timestamp = null;
    this.httpStatus = null;
    this.path = null;
    this.message = null;
  }

  public HttpErrorInfo(HttpStatus httpStatus, String path, String message) {
    timestamp = ZonedDateTime.now();
    this.httpStatus = httpStatus;
    this.path = path;
    this.message = message;
  }

  public ZonedDateTime getTimestamp() {
    return timestamp;
  }

  public String getPath() {
    return path;
  }

  public int getStatus() {
    return httpStatus.value();
  }

  public String getError() {
    return httpStatus.getReasonPhrase();
  }

  public String getMessage() {
    return message;
  }

  public void setTimestamp(ZonedDateTime timestamp) {
    this.timestamp = timestamp;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public void setHttpStatus(HttpStatus httpStatus) {
    this.httpStatus = httpStatus;
  }

  public void setMessage(String message) {
    this.message = message;
  }
}
