// Write a program that reads a number from the standard input, then draws a
// pyramid like this:
//
//
//    *
//   ***
//  *****
// *******
//
// The pyramid should have as many lines as the number was


import java.util.Scanner;

public class DrawPyramid {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("How tall pyramid do you wish for, oh pharaoh?");
        int triangleRows = scanner.nextInt();

        for (int row = 0; row < triangleRows+1; row++) {
            for (int spaces = triangleRows; spaces > row; spaces-- ) {
                System.out.print(" ");
            }
            for (int col = 0; col < ((row*2)-1); col++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }
}
