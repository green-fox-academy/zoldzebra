// We have a number of bunnies and each bunny has two big floppy ears.
// We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).

public class Bunnies {

  public static void main(String[] args) {
    int bunnies = 4;
    int earsPerBunny = 2;
    int bunnyEarsTotal = 0;
    int counter = 0;

    System.out.println("Method 0: " + bunnyEarCounter0(bunnies, earsPerBunny, bunnyEarsTotal, counter));

    System.out.println("Method 1: " + bunnyEarCounter1(bunnies, earsPerBunny, bunnyEarsTotal));

  }

  public static int bunnyEarCounter0(int bunnies, int earsPerBunny, int bunnyEarsTotal, int counter){
    bunnyEarsTotal += earsPerBunny;
    counter ++;
    if (counter < bunnies){
      return bunnyEarCounter0(bunnies, earsPerBunny, bunnyEarsTotal, counter);
    } else {
      return bunnyEarsTotal;
    }
  }

  public static int bunnyEarCounter1(int bunnies, int earPerBunny, int bunnyEarsTotal){
    if (bunnies > 0){
      bunnyEarsTotal += earPerBunny;
      bunnies--;
      return bunnyEarCounter1(bunnies, earPerBunny, bunnyEarsTotal);
    } else {
      return bunnyEarsTotal;
    }


  }




}
