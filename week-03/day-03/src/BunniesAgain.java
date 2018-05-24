// We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies
// (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say
// have 3 ears, because they each have a raised foot. Recursively return the
// number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).

public class BunniesAgain {

  public static void main(String[] args) {
    int bunnies = 12;
    int earsPerEvenBunny = 2;
    int earsPerOddBunny = 3;
    int bunnyEarsTotal = 0;
    int counter = 0;

    System.out.println("Number of bunnyears: " + bunnyEarCounter(bunnies, earsPerEvenBunny, earsPerOddBunny, bunnyEarsTotal) );

  }

  public static int bunnyEarCounter(int bunnies, int earPerEvenBunny, int earsPerOddBunny, int bunnyEarsTotal){
    if (bunnies == 0){
      bunnyEarsTotal = 0;
    } else {
      return bunnyEarsTotal + bunnyEarCounter(bunnies - 1, earPerEvenBunny, earsPerOddBunny, bunnyEarsTotal);
    }
    return bunnyEarsTotal;
  }

}
