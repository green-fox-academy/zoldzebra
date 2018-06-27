package com.greenfoxacademy.coloringaround;

import org.springframework.beans.factory.annotation.Autowired;

public class GreenColor implements MyColor {
  @Autowired
  Printer printer;

  @Override
  public void printColor() {
    printer.log("This is BLUE");
  }
}
