public class Things_flying {

  public static void main(String[] args) {

    Helicopter helicopter0 = new Helicopter("Russian copter");
    Bird bird0 = new Bird("Pelican");

    System.out.println(helicopter0.name + ": " + helicopter0.takeOff());
    System.out.println(helicopter0.name + ": " + helicopter0.fly());
    System.out.println(helicopter0.name + ": " + helicopter0.land());

    System.out.println(bird0.name + ": " + bird0.takeOff());
    System.out.println(bird0.name + ": " + bird0.fly());
    System.out.println(bird0.name + ": " + bird0.land());
  }
}
