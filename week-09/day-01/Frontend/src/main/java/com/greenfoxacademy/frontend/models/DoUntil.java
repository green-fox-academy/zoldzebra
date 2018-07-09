package com.greenfoxacademy.frontend.models;

public class DoUntil {

  private int result;

  public DoUntil(String what, int until) {
    if (what.equals("sum")) {
      result = sum(until);
    } else if (what.equals("factor")) {
      result = factor(until);
    }
  }

  public int sum(int until) {
    int result = 0;
    for (int i = 0; i <= until; i++) {
      result += i;
    }
    return result;
  }

  public int factor(int until) {
    int result = 1;
    for (int i = 1; i <= until; i++) {
      result *= i;
    }
    return result;
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }
}
