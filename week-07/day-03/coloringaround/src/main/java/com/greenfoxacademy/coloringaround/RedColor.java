package com.greenfoxacademy.coloringaround;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RedColor implements MyColor {

  @Autowired
  Printer printer;

  @Override
  public void printColor() {
    printer.log("This is RED");
  }
}
