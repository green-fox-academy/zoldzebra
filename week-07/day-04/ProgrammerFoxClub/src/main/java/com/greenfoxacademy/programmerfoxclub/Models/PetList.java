package com.greenfoxacademy.programmerfoxclub.Models;

import java.util.HashMap;
import java.util.Map;

public class PetList {

  private Map<String, Pet> petList;

  public PetList() {
    this.petList = new HashMap<>();
    System.out.println("Empty petList created");
  }

  public void addPet(Pet pet) {
    this.petList.put(pet.getName(), pet);
    System.out.println(pet.getName() + " added to petList");
  }

  public Map<String, Pet> getPetList() {
    return petList;
  }

  public void setPetList(Map<String, Pet> petList) {
    this.petList = petList;
  }

  public Pet getPetFromList (String petName) {
    return this.petList.get(petName);
  }
}
