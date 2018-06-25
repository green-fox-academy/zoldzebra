package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {

  // @RequestMapping("/greeting")
  @GetMapping("/greeting")
  public Greeting greeting (@RequestParam String name) {
    Greeting greeting = new Greeting(name);
    return greeting;
  }

}
