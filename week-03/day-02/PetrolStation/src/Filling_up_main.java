/*
Create Station and Car classes
Station
gasAmount
refill(car) -> decreases the gasAmount by the capacity of the car and increases the cars gasAmount
Car
gasAmount
capacity
create constructor for Car where:
initialize gasAmount -> 0
initialize capacity -> 100
*/

public class Filling_up_main {


  public static void main(String[] args) {

    Car car0 = new Car();
    Station station0 = new Station(5000);

    System.out.println("Car fuel before refill: " + car0.gasAmount);
    System.out.println("Station gas after after refill: " + station0.gasAmount);

    System.out.println("Refilling...");
    station0.refill(car0);

    System.out.println("Car fuel after refill: " + car0.gasAmount);
    System.out.println("Station gas amount after refill: " + station0.gasAmount);
  }
}
