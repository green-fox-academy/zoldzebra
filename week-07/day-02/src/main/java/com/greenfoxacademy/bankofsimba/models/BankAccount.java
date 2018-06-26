package com.greenfoxacademy.bankofsimba.models;

public class BankAccount {

  private String name;
  private double balance;
  private String animalType;
  private String currency;
  private boolean king;

  public BankAccount(){

  }

  public BankAccount(String name, double balance, String animalType) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.currency = "zebra";
    this.king = false;
    System.out.println("New bankaccount created: " + this.name + ", " + this.balance + ", " + this.animalType);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public String getAnimalType() {
    return animalType;
  }

  public void setAnimalType(String animalType) {
    this.animalType = animalType;
  }

  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public boolean isKing() {
    return king;
  }

  public void setKing(boolean king) {
    this.king = king;
  }
}
