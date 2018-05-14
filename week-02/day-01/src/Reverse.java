// - Create an array variable named `aj`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Reverse the order of the elements in `aj`
// - Print the elements of the reversed `aj`

import java.util.Arrays;

public class Reverse {

  public static void main(String[] args) {

    int[] aj = {3, 22, 5, 6, 55};

    int[] ajSwap = new int[5];

    for (int i = 0; i < ajSwap.length; i++) {

      ajSwap[i] = aj[(ajSwap.length-1) - i];

    }

    for (int i = 0; i < aj.length; i++) {

      aj[i] = ajSwap[i];

    }

    System.out.println("Reversed aj = " + Arrays.toString(aj));

  }

}
