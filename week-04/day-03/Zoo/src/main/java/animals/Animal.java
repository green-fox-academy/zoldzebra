package main.java.animals;

abstract public class Animal {

  String name;
  int age;
  String gender;
  int numberOfLegs;
  // if  we implement some religion we can think about:
  boolean hasASoul;

  public String getName(){
    return this.name;
  }

  abstract public String breed();

}
