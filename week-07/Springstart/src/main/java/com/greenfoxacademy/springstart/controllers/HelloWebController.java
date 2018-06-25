package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWebController {

  @RequestMapping("/web/greeting")
  public String greeting(Model model, Model model2) {
    model.addAttribute("name_var", " World");
    model2.addAttribute("name", "Hungary");
    return "greeting2";
  }
}
