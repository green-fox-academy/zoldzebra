import java.util.Scanner;

public class AnimalsAndLegs {

    public static void main(String[] args) {
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have
    Scanner scanner = new Scanner(System.in);

    System.out.println("Tell me the number of chickens, please!");
    int chicks = scanner.nextInt();
    System.out.println("Tell me the number of pigs, pretty please!");
    int pigs = scanner.nextInt();
    System.out.println("In case all animals are complete they have " + ((chicks * 2) + (pigs * 4)) + " legs altogether. Unbelievable.");



    }

}
