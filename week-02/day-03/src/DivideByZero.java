// Create a function that takes a number
// divides ten with it,
// and prints the result.
// It should print "fail" if the parameter is 0
import java.util.*;
import java.util.Scanner;

public class DivideByZero {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int input = scanner.nextInt();
    System.out.println(divideByZero(input));

  }

  public static String divideByZero(int input){
    String output = "";
    int outInt = 0;
    try {
      outInt = 10 / input;
      //output = Integer.toString(outInt);
      output = "" + outInt;
    } catch (ArithmeticException e) {
      output = "fail";
    }
    return output;
  }

}
