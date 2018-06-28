package com.greenfoxacademy.programmerfoxclub.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  @GetMapping ("/")
  public String renderIndexPage() {
    return "index";
  }

  @GetMapping ("/login")
  public String renderLoginpage() {
    return "login";
  }

  @PostMapping ("/login")
  public String getPetName(@RequestParam ("name") String petName) {
    return "/" + petName;
  }

}
