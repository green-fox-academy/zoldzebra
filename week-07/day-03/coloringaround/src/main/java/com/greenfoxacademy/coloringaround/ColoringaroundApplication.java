package com.greenfoxacademy.coloringaround;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.greenfoxacademy.hellobeanworld.Printer;

@SpringBootApplication
public class ColoringaroundApplication implements CommandLineRunner {

  @Autowired
  MyColor myColor;


  public static void main(String[] args) {
    SpringApplication.run(ColoringaroundApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    myColor.printColor();
  }
}
