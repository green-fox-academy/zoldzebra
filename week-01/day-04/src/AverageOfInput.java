import java.util.Scanner;

public class AverageOfInput {

    // Write a program that asks for 5 integers in a row,
    // then it should print the sum and the average of these numbers like:
    //
    // Sum: 22, Average: 4.4

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int Inputs = 5;
        int sum = 0;
        int avg = 0;

        System.out.println("Please enter " + Inputs + " integers below:");
        for (int i = 0; i < Inputs; i++) {
            sum = sum + scanner.nextInt();
        }

        System.out.println("Sum: " + sum + ", Average: " + ((double) sum / Inputs) );

    }

}
