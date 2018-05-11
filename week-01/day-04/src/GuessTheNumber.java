// Write a program that stores a number, and the user has to figure it out.
// The user can input guesses, after each guess the program would tell one
// of the following:
//
// The stored number is higher
// The stried number is lower
// You found the number: 8

import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a maximum value of my secret random number! (my minimum will be 0)");
        int max = scanner.nextInt();
        int secretNumber = (int) (Math.random() * (max+1));
        // int guess = -1;

        System.out.println("Thanks. Now try to guess my random number!");
        System.out.println("What's your guess?");
        int guess = scanner.nextInt();

        while (secretNumber != guess) {
            if (guess > secretNumber) {
                System.out.println("The stored number is lower, guess again!");
                guess = scanner.nextInt();
            } else if (guess < secretNumber) {
                System.out.println("The stored number is higher, guess again!");
                guess = scanner.nextInt();
            }
        }
        System.out.println("You found the number: " + secretNumber);
    }
}
