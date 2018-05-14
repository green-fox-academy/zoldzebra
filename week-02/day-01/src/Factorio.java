//  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `factorio`
//   that returns it's input's factorial


public class Factorio {

  public static void main(String[] args) {

    int a = 7;

    System.out.println(a + "! = " + factorio(a));

  }

  private static int factorio(int toFactor) {

    int factorial = 1;

    for (int i = 1; i < toFactor+1; i++) {

      factorial = factorial * i;

    }

    return factorial;

  }


}

