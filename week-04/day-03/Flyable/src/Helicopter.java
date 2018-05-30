public class Helicopter extends Vehicle implements Flyable{

  public Helicopter(String name){
    this.name = name;
  }

  @Override
  public String land() {
    return "Landing vertically.";
  }

  @Override
  public String takeOff() {
    return "Taking off vertically.";
  }

  @Override
  public String fly() {
    return "Flying by using rotors.";
  }
}

