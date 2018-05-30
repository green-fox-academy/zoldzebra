package main.java.animals;

public class Reptile extends Animal {

  private String colorOfScales;

  public Reptile(String name){
    this.name = name;
  }

  @Override
  public String breed(){
    String breeding = "laying eggs";

    return breeding;
  }

  // getters-setters generated w IntelliJ for practice

  public String getColorOfScales() {
    return colorOfScales;
  }

  public void setColorOfScales(String colorOfScales) {
    this.colorOfScales = colorOfScales;
  }




}
