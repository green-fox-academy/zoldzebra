package main.java.animals;

public class Mammal extends Animal{

  private int numberOfTeeth;
  private int mothersMilkAmount;

  public Mammal(String name){
    this.name = name;
  }

  @Override
  public String breed(){
    String breeding = "pushing out small copies of itself with slight genetic modifications";
    return breeding;
  }

  // getters-setters generated w IntelliJ for practice

  public int getNumberOfTeeth() {
    return numberOfTeeth;
  }

  public void setNumberOfTeeth(int numberOfTeeth) {
    this.numberOfTeeth = numberOfTeeth;
  }

  public int getMothersMilkAmount() {
    return mothersMilkAmount;
  }

  public void setMothersMilkAmount(int mothersMilkAmount) {
    this.mothersMilkAmount = mothersMilkAmount;
  }
}
