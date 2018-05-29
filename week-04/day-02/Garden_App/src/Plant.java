public class Plant {

  protected double waterAmount;
  protected String color;
  protected String species;
  protected int waterMinimum;
  protected static double absorbLevel;

  public void needsWater(){
    if (this.waterAmount < this.waterMinimum){
      System.out.println("The " + this.color + " " + this.species + " needs water.");
    } else {
      System.out.println("The " + this.color + " " + this.species + " doesn't need water.");
    }
  }

  public void watering(int watering){
    this.waterAmount += this.absorbLevel * watering;
  }
}
