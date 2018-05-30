package main.java.music;

abstract public class StringedInstrument extends Instrument {

  int numberOfStrings;

  abstract String sound();

  public void play(){
    System.out.println(this.name + ", a " + numberOfStrings + "-stringed instrument that goes " + this.sound());
  }
}
