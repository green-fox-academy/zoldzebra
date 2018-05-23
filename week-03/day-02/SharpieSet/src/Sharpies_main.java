/*Reuse your Sharpie class
Create SharpieSet class
it contains a list of Sharpie
countUsable() -> sharpie is usable if it has ink in it
removeTrash() -> removes all unusable sharpies
*/

public class Sharpies_main {

  public static void main(String[] args) {

    Sharpie sharpie0 = new Sharpie("red", 12);
    Sharpie sharpie1 = new Sharpie("blue", 33);
    Sharpie sharpie2 = new Sharpie("green", 20);
    Sharpie sharpie3 = new Sharpie("yellow", 6);

    SharpieSet sharpieSet0 = new SharpieSet();
    sharpieSet0.add(sharpie0);
    sharpieSet0.add(sharpie1);
    sharpieSet0.add(sharpie2);
    sharpieSet0.add(sharpie3);

    System.out.println(sharpie0 + " ink amount before usage:" + sharpie0.inkAmount);

    sharpie0.use();
    System.out.println(sharpie0 + " ink amount after 1 usage:" + sharpie0.inkAmount);
    System.out.println("Usable sharpies in set: " + sharpieSet0.countUsable());

    sharpie0.use();
    System.out.println(sharpie0 + " ink amount after 2 usage:" + sharpie0.inkAmount);
    System.out.println("Usable sharpies in set: " + sharpieSet0.countUsable());

    System.out.println("Disposing unusable sharpie(s).");
    sharpieSet0.removeTrash();
    System.out.println("Usable sharpies in set: " + sharpieSet0.countUsable());

  }





}
