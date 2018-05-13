// Write a program that reads a number from the standard input, then draws a
// diamond like this:
//
//
//    *
//   ***
//  *****
// *******
//  *****
//   ***
//    *
//
// The diamond should have as many lines as the number was

import java.util.Scanner;

public class DrawDiamond {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("How tall diamond do you wish for, oh demigod?");
        int triangleRows = scanner.nextInt();

        for (int row = 0; row < ((triangleRows+1)/2); row++) {
            for (int spaces = triangleRows; spaces > row; spaces-- ) {
                System.out.print(" ");
            }
            for (int col = 0; col < ((row*2)-1); col++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        int spaceCounter = 0;

        for (int row = ((triangleRows+1)/2); row > 0; row--) {

            for (int spaces = 0; spaces < spaceCounter ; spaces++ ) {
                System.out.print(".");
            }
            for (int col = row; col > 0; col--) {
                System.out.print("*");
            }
            System.out.print("\n");
            spaceCounter++;

        }

    }
}
