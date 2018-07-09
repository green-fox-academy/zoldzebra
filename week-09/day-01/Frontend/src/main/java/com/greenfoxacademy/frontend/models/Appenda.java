package com.greenfoxacademy.frontend.models;

public class Appenda {

  String appended;

  public Appenda(String input) {
    this.appended = input + "a";
    System.out.println(appended);
  }

  public String getAppended() {
    return appended;
  }

  public void setAppended(String appended) {
    this.appended = appended;
  }
}
