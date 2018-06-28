package com.greenfoxacademy.programmerfoxclub.Models;

import java.util.List;

public class PetList {

  private List<Pet> petList;

  public PetList() {
    this.petList = null;
  }

  public void addPet(Pet pet) {
    this.petList.add(pet);
  }


  public List<Pet> getPetList() {
    return petList;
  }

  public void setPetList(List<Pet> petList) {
    this.petList = petList;
  }
}
