package main.java.animals;

public class Bird extends Animal {

  private int sizeOfWings;
  private int sizeOfBeak;
  private String colorOfBeak;

  public Bird(String name){
    this.name = name;
  }

  @Override
  public String breed(){
    String breeding = "laying eggs";
    return breeding;
  }

  // getters-setters generated w IntelliJ for practice

  public int getSizeOfWings() {
    return sizeOfWings;
  }

  public void setSizeOfWings(int sizeOfWings) {
    this.sizeOfWings = sizeOfWings;
  }

  public int getSizeOfBeak() {
    return sizeOfBeak;
  }

  public void setSizeOfBeak(int sizeOfBeak) {
    this.sizeOfBeak = sizeOfBeak;
  }

  public String getColorOfBeak() {
    return colorOfBeak;
  }

  public void setColorOfBeak(String colorOfBeak) {
    this.colorOfBeak = colorOfBeak;
  }
}
