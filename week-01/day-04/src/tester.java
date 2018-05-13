// Loads the scanner to the file

import java.util.Scanner;

public class tester {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("How tall triangle do you wish for?");
        int triangleRows = scanner.nextInt();
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


