package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {

  @RequestMapping("/greeting")
  public Greeting greeting () {
    Greeting greeting = new Greeting();
    return greeting;
  }

}
