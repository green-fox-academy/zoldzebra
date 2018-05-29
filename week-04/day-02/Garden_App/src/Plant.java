public class Plant {

  protected int waterAmount;
  protected String color;
  protected static String species;
  protected static int waterMinimum;
  protected static double absorbLevel;

  public void needsWater(){
    if (this.waterAmount < this.waterMinimum){
      System.out.println("The " + this.color + " " + this.species + " needs water.");
    } else {
      System.out.println("The " + this.color + " " + this.species + " doesn't need water.");
    }
  }

  public void watering(int watering){

  }



}
