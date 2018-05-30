package main.java.music;

public class BassGuitar extends StringedInstrument {
  public BassGuitar(){
    this.name = "Bass guitar";
    this.numberOfStrings = 4;
  }

  public BassGuitar(int numberOfStrings){
    this.name = "Electric guitar";
    this.numberOfStrings = numberOfStrings;
  }

  @Override
  public String sound() {
    return "Dumm-dumm-dumm";
  }
}
