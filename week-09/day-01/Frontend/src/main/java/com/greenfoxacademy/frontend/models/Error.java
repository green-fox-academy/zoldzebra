package com.greenfoxacademy.frontend.models;

public class Error {

  String error;

  public Error(){}

  public Error (String message) {
    this.error = message;
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }
}
