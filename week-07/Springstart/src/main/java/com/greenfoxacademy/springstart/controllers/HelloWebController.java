package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWebController {

  @RequestMapping("/web/greeting")
  public String greeting(@RequestParam String name, Model model) {
    Greeting greeting = new Greeting(name);
    model.addAttribute("name", greeting.getContent());
    model.addAttribute("count", greeting.getId());
    model.addAttribute("color", greeting.getColor());
    model.addAttribute("fontsize", greeting.getFontsize());
    System.out.println(greeting.getColor() + greeting.getContent() + greeting.getId() + greeting.getFontsize());
    return "greeting";
  }
}
