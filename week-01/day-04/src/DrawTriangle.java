// Write a program that reads a number from the standard input, then draws a
// triangle like this:
//
// *
// **
// ***
// ****
//
// The triangle should have as many lines as the number was

import java.util.Scanner;

public class DrawTriangle {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("How tall triangle do you wish for?");
        int triangleRows = scanner.nextInt();

        for (int row = 0; row < triangleRows+1; row++) {
            for (int col = 0; col < row; col++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }

}
