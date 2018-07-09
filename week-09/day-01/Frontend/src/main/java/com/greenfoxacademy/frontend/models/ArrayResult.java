package com.greenfoxacademy.frontend.models;

import java.util.ArrayList;

public class ArrayResult {

  private int result;

  public ArrayResult() {}

  public ArrayResult(String what, ArrayList<Integer> numbers) {
    if (what.equals("sum")) {
      this.result = sum(numbers);
    } else if (what.equals("multiply")) {
      this.result = multiply(numbers);
    }
  }

  public int sum(ArrayList<Integer> numbers) {
    int result = 0;
    for (int i = 0; i < numbers.size(); i++) {
      result += numbers.get(i);
    }
    return result;
  }

  public int multiply(ArrayList<Integer> numbers) {
    int result = 1;
    for (int i = 0; i < numbers.size(); i++) {
      result *= numbers.get(i);
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
