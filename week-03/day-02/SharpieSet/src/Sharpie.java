public class Sharpie {

  String color;
  float width;
  float inkAmount;
  boolean usable;

  public Sharpie(String color, float width){
    this.color = color;
    this.width = width;
    this.inkAmount = 100;
    this.usable = true;
  }

  public void use(){
    this.inkAmount -= 50;
  }

}
