import java.util.Scanner;

public class MileToKmConverter {

    public static void main(String[] args) {
        // Write a program that asks for an integer that is a distance in kilometers,
        // then it converts that value to miles and prints it
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter an integer for km that I will convert to miles!");
        int kms = scanner.nextInt();

        // 1 km = 0.62 miles

        System.out.println(kms + " kilometres equals " + ((double) kms * 0.62) + " miles." );


    }

}
