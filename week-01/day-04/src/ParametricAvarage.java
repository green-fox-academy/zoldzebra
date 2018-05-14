// Write a program that asks for a number.
// It would ask this many times to enter an integer,
// if all the integers are entered, it should print the sum and average of these
// integers like:
//
// Sum: 22, Average: 4.4


import java.util.Scanner;

public class ParametricAvarage {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int inputs = 5;
    int sum = 0;
    int avg = 0;

    System.out.println("With how many numbers do you want to calculate?");
    inputs = scanner.nextInt();

    System.out.println("Please enter your " + inputs + " integers below:");
    for (int i = 0; i < inputs; i++) {
      System.out.print("input number " + (i+1) + ": ");
      sum = sum + scanner.nextInt();
    }

    System.out.println("Sum: " + sum + ", Average: " + ((double) sum / inputs) );

  }

}
