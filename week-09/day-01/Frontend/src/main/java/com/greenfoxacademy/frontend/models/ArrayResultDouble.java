package com.greenfoxacademy.frontend.models;

import java.util.ArrayList;

public class ArrayResultDouble {

  ArrayList<Integer> result;

  public ArrayResultDouble() {}

  public ArrayResultDouble(ArrayList<Integer> numbers) {
    for (int i = 0; i < numbers.size(); i++) {
      numbers.set(i, numbers.get(i) * 2);
    }
    this.result = numbers;
  }

  public ArrayList<Integer> getResult() {
    return result;
  }

  public void setResult(ArrayList<Integer> result) {
    this.result = result;
  }
}
