package com.greenfoxacademy.frontend.models;

import java.util.ArrayList;

public class ArrayHandler {

  String what;
  ArrayList<Integer> numbers;

  public ArrayHandler(){}

  public ArrayHandler(String what, ArrayList<Integer> numbers) {
    this.what = what;
    this.numbers = numbers;
  }

  public String getWhat() {
    return what;
  }

  public void setWhat(String what) {
    this.what = what;
  }

  public ArrayList<Integer> getNumbers() {
    return numbers;
  }

  public void setNumbers(ArrayList<Integer> numbers) {
    this.numbers = numbers;
  }
}
