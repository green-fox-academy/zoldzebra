package com.greenfoxacademy.useful_utilities.controllers;

import com.greenfoxacademy.useful_utilities.services.EmailValidation;
import com.greenfoxacademy.useful_utilities.services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  @Autowired
  UtilityService utilityService;
  @Autowired
  EmailValidation emailValidation;


  @GetMapping ("/useful")
  public String showUsefulPage() {
    return "useful";
  }

  @GetMapping ("/useful/colored")
  public String coloredSite (Model model) {
    model.addAttribute("backgroundcolor", utilityService.randomColor());
    return "/colored";
  }

  @GetMapping("/useful/email")
  public String emailValidator (@RequestParam("email") String emailaddress, Model model) {
    emailValidation.validateEmail(emailaddress);
    model.addAttribute("text", emailValidation.getEmailValidationText());
    model.addAttribute("color", emailValidation.getValidationColor());
    return "email";
  }





}
