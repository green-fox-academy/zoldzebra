// Write a program that asks for two numbers and prints the bigger one

import java.util.Scanner;

public class PrintBigger {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give me a number!");
        int a = scanner.nextInt();
        System.out.println("and give me another one too...");
        int b = scanner.nextInt();
        int bigger = (a - b > 0) ? a : b;
        System.out.println("The bigger number is: " + bigger);

    }


}
