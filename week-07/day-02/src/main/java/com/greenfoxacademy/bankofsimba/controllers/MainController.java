package com.greenfoxacademy.bankofsimba.controllers;

import com.greenfoxacademy.bankofsimba.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

  List<BankAccount> accountList;

  MainController() {
    this.accountList = new ArrayList<>();
    accountList.add(new BankAccount("Timon", 1500, "meerkat"));
    accountList.add(new BankAccount("Pumba", 500, "warthog"));
    accountList.add(new BankAccount("Mufasa", 1500, "lion"));
    accountList.get(2).setKing(true);
    accountList.add(new BankAccount("Scar", 3, "lion"));
  }

  @GetMapping("/show")
  public String addBankAccount(Model model) {
    model.addAttribute("simbaAccount", new BankAccount("Simba", 2000, "lion"));
    model.addAttribute("text", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
    return "show";
  }

  @GetMapping("/accountlist")
  public String accountList(Model model) {
    model.addAttribute("accountList", this.accountList);
    return "accountlist";
  }



}
