// Loads the scanner to the file
import java.util.Scanner;

public class tester {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("How tall triangle do you wish for?");
        int triangleRows = scanner.nextInt();

        for (int row = 0; row < triangleRows+1; row++) {
            for (int col = triangleRows; col > row; col = col-1) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }
}

