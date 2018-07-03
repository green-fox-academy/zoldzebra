package com.greenfoxacademy.programmerfoxclub.Controllers;

import com.greenfoxacademy.programmerfoxclub.Models.Pet;
import com.greenfoxacademy.programmerfoxclub.Models.PetList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.regex.*;

@Controller
public class MainController {

  PetList appPetList = new PetList();

  @GetMapping ("")
  public String renderIndexPage(@RequestParam(value = "petName") String petName, Model model) {
    if (petNameRegexChecker(petName)) {
      Pet newPet = new Pet(petName);
      appPetList.addPet(newPet);
      appPetList.getPetFromList(petName);
      model.addAttribute("pet", appPetList.getPetFromList(petName));
      return "index";
    } else {
      return "loginerror";
    }
  }

  @GetMapping ("/login")
  public String renderLoginpage() {
    return "login";
  }

  @GetMapping ("/nutritionStore")
  public String nutritionStore (@RequestParam(value = "name") String petName, Model model) {
    model.addAttribute("pet", appPetList.getPetFromList(petName));
    return "nutritionStore";
  }

  public static boolean petNameRegexChecker(String petName) {
    boolean isNameCorrect = Pattern.matches("(^[A-Z]+[a-z]+[0-9]+$)", petName);
    return isNameCorrect;
  }

}
