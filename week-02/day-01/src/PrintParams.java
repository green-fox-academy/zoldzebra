//  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `printParams`
//   which prints the input String parameters
// - It can have any number of parameters

// Examples
// printParams("first")
// printParams("first", "second")
// printParams("first", "second", "third", "fourh")
// ...

public class PrintParams {

  public static void main(String[] args) {

    printParams("egy", "ketto", "harom", "negy");
    printParams("ketto", "harom", "negy");
    printParams("egy", "ketto", "negy");
    printParams("egy", "negy");

  }

  public static void printParams(String... strings) {

    String stringToPrint ="";

    for (String stringToAdd : strings){

      stringToPrint += " " + stringToAdd;

    }

    System.out.println(stringToPrint);

  }

}
