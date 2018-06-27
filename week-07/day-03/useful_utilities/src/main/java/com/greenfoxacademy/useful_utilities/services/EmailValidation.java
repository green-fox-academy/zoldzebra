package com.greenfoxacademy.useful_utilities.services;
import org.springframework.stereotype.Service;

@Service
public class EmailValidation {

  String emailValidationText;
  String validationColor;

  public EmailValidation() {
    emailValidationText = null;
    validationColor = null;

  }


  public void validateEmail(String emailAddress) {
    if (emailAddress.contains("@") && emailAddress.contains(".")) {
      setEmailValidationText(emailAddress + " is a valid email address.");
      setValidationColor("green");
    } else {
      setEmailValidationText(emailAddress + " is not a valid email address.");
      setValidationColor("red");
    }
    System.out.println("emailaddress validated");
  }

  public String getEmailValidationText() {
    return this.emailValidationText;
  }

  public void setEmailValidationText(String emailValidation) {
    this.emailValidationText = emailValidation;
  }

  public String getValidationColor() {
    return this.validationColor;
  }

  public void setValidationColor(String validationColor) {
    this.validationColor = validationColor;
  }

}
