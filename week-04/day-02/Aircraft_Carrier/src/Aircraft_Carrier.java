import java.util.ArrayList;

public class Aircraft_Carrier {

  String name;
  int ammoStock;
  int actualammo;
  int health;
  ArrayList<Aircraft> airforce;

  public Aircraft_Carrier(String name, int ammoStock, int health){
    this.name = name;
    this.ammoStock = ammoStock;
    this.actualammo = ammoStock;
    this.health = health;
  }

  public void add(Aircraft aircraft){
    airforce.add(aircraft);
  }

  public void getStatus(){
    System.out.println("HP: " + this.health + ", Aircraft count: " + airforce.size() + ", Storage: " + this.actualammo
            + ", Total damage: XXXX");
    System.out.println("Aircrafts: ");
    for (int i = 0; i < airforce.size(); i++){
      System.out.println(airforce.get(i).getStatus());
    }
  }
}
