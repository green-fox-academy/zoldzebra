package com.greenfoxacademy.programmerfoxclub.Models;

public class Pet {

  private String name;
  private String food;
  private String drink;
  private TrickList petTrickList;


  public Pet() {
    this.name = "Mokka";
    this.petTrickList = new TrickList();
    this.food = "nutella";
    this.drink = "yucky water";
  }

  public Pet(String name) {
    this.name = name;
    this.petTrickList = new TrickList();
    this.food = "nutella";
    this.drink = "yucky water";
    System.out.println(name + " is alive now!");
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getFood() {
    return food;
  }

  public void setFood(String food) {
    this.food = food;
  }

  public String getDrink() {
    return drink;
  }

  public void setDrink(String drink) {
    this.drink = drink;
  }

  public TrickList getPetTrickList() {
    return petTrickList;
  }

  public void setPetTrickList(TrickList petTrickList) {
    this.petTrickList = petTrickList;
  }
}
