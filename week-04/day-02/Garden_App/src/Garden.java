import java.util.ArrayList;

public class Garden {

  public static void main(String[] args) {

    ArrayList<Plant> gardenPlants = new ArrayList<Plant>();

    Plant tree0 = new Tree("orange");
    gardenPlants.add(tree0);
    Plant tree1 = new Tree("purple");
    gardenPlants.add(tree1);
    Plant flower0 = new Flower("yellow");
    gardenPlants.add(flower0);
    Plant flower1 = new Flower("blue");
    gardenPlants.add(flower1);

    statusCheck(gardenPlants);
    wateringGarden(40, gardenPlants);
    statusCheck(gardenPlants);
    wateringGarden(70, gardenPlants);
    statusCheck(gardenPlants);
  }

  public static void wateringGarden(int wateringGarden, ArrayList<Plant> gardenPlants) {
    System.out.println("\nWatering with " + wateringGarden);
    for (Plant plants : gardenPlants) {
      plants.watering(wateringGarden / gardenPlants.size());
    }
  }

  public static void statusCheck(ArrayList<Plant> gardenPlants) {
    for (Plant plants : gardenPlants) {
      plants.needsWater();
    }
  }
}


