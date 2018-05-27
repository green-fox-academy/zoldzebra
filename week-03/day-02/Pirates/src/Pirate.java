/*
Create a Pirate class. While you can add other fields and methods, you must have these methods:-
drinkSomeRum() - intoxicates the Pirate some
howsItGoingMate() - when called, the Pirate replies, if drinkSomeRun was called:-
0 to 4 times, "Pour me anudder!"
else, "Arghh, I'ma Pirate. How d'ya d'ink its goin?", the pirate passes out and sleeps it off.
If you manage to get this far, then you can try to do the following.

die() - this kills off the pirate, in which case, drinkSomeRum, etc. just result in he's dead.
brawl(x) - where pirate fights another pirate (if that other pirate is alive) and there's a 1/3 chance, 1 dies, the other dies or they both pass out.
And... if you get that far...

Add a parrot.
*/

public class Pirate {

  public static int rumLevel;
  public static boolean sleeps;
  public static boolean alive;
  public static boolean hasParrot;

  public String name;

  public Pirate(){
    this.rumLevel = 0;
    this.sleeps = false;
    this.alive = true;
    this.name = "Unknown pirate"; // kell ide majd egy counter, hogy hanyadik unknown pirate

    double parrotRandom = Math.random() * 101;
    if (parrotRandom >= 80){
      this.hasParrot = true;
    } else {
      this.hasParrot = false;
    }

    System.out.println(this.name + " came to existence!");
  }

  public Pirate(String name){
    this.name = name;
    System.out.println("Pirate " + this.name + " came to existence!");
  }

  public void drinkSomeRum() {
    if (this.alive) {
      rumLevel += 1;
      System.out.println(this.name + " had a rum.");
    } else {
      System.out.println("He's dead.");
    }
  }

  public void howsItGoingMate(){
    if (this.alive){
      if (this.rumLevel >= 5) {
        System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
        this.sleeps = true;
      } else {
        System.out.println("Pour me anudder!");
        this.sleeps = false;
      }
    } else {
      System.out.println("He's dead, can't talk.");
    }
  }

  public void fallToSleep(){
    if (this.alive) {
      this.sleeps = true;
      System.out.println(this.name + " fell to sleep.");
    } else {
      System.out.println(this.name + " is dead, sleeps forever now...");
    }
  }

  public void die(){
    this.alive = false;
    System.out.println(this.name + " died.");
  }

  public void brawl(Pirate pirate){
    System.out.println(this.name + " and " + pirate.name + " started a brawl!");
    double brawlRandom = Math.random();
    if (this.alive) {
      if (pirate.alive) {
        if (brawlRandom <= (0.33)) {
          pirate.die();
        } else if (brawlRandom > (0.33) && brawlRandom <= (0.66)) {
            this.die();
        } else{
          this.fallToSleep();
          pirate.fallToSleep();
        }
      }
    }
  }
}
