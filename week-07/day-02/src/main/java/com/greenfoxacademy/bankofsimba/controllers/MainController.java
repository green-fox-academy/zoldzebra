package com.greenfoxacademy.bankofsimba.controllers;

import com.greenfoxacademy.bankofsimba.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

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
    accountList.get(3).setGood(false);
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

  /*
  @GetMapping("/accountlist")
  public String addMoney(Integer index) {
    accountList.get(index).setBalance(accountList.get(index).getBalance() + 10);
    return "redirect: /";
  }
  */

  /*
  @RequestMapping(value="/accountlist", method = POST)
  @ResponseBody
  public String addMoney(@RequestParam("accountID") int index){
    accountList.get(index).setBalance(accountList.get(index).getBalance() + 10);
    System.out.println(accountList.get(index).getBalance());
    return "redirect: /accountlist";
  }
  */
  @PostMapping (value="/accountlist")
  public String addMoney(@RequestParam("accountID") int index){
    accountList.get(index).setBalance(accountList.get(index).getBalance() + 10);
    return "redirect:/accountlist";
  }

}
