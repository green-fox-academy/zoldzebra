import java.util.Arrays;

public class Unique {

  public static void main(String[] args) {
    //  Create a function that takes a list of numbers as a parameter
    //  Returns a list of numbers where every number in the list occurs only once

    //  Example
    //  System.out.println(unique(new int[] {1, 11, 34, 11, 52, 61, 1, 34}));
    //  should print: `[1, 11, 34, 52, 61]`

    //unique();

    System.out.println(Arrays.toString(unique(new int[]{1, 11, 34, 11, 52, 61, 1, 34})));

  }


  public static int[] unique(int[] unsorted){

//make az index array to indicate duplicates

    int[] sorted = new int[unsorted.length];

    int[] index = new int[unsorted.length];

    int arrayLength = 0;

    for (int i = 0; i < unsorted.length; i++) {

      for (int j = 0; j < unsorted.length; j++) {

        if (unsorted[i] == unsorted [j]){

          index[i] += 1;
        }
      }
    }
//sort out duplicates

    for (int i = 0; i < unsorted.length; i++) {

      if (index[i] == 2) {

        for (int j = i+1 ; j < unsorted.length; j++) {

          if (unsorted[i] == unsorted [j]) {
            sorted[i] = -1;
          }
        }
      }
    }

   // System.out.println("index: " + Arrays.toString(index));
   // System.out.println("sorted: " + Arrays.toString(sorted));
   // System.out.println("unsorted: " + Arrays.toString(unsorted));

// define output array length, create array and fill up w values

    for (int i = 0; i < index.length; i++) {
      if (sorted[i] == 0) {
        arrayLength += 1;
      }
    }

    int[] output = new int[arrayLength];

    // System.out.println("output raw: " + Arrays.toString(output));

    int counter = -1;
    for (int i = 0; i < index.length; i++) {

        if (sorted[i] == 0) {
          counter += 1;
          output[counter] = unsorted[i];
        }
    }

    System.out.println("output final: " + Arrays.toString(output));

    return output;

  }
}

