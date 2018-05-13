// Write a program that reads a number from the standard input,
// Then prints "Odd" if the number is odd, or "Even" if it is even.

import java.util.Scanner;

public class OddEven {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please add an integer number: ");
        int a = scanner.nextInt();
        String answer = (a % 2 == 0) ? "Even" : "Odd";
        System.out.println(answer);

        /**
         * if (a % 2 == 0){
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
        **/
    }
}
