// Write a program that stores 3 sides of a cuboid as variables (doubles)
// The program should write the surface area and volume of the cuboid like:
//
// Surface Area: 600
// Volume: 1000

public class Cuboid {

    public static void main(String[] args) {

        double a = 10;
        double b = 20;
        double c = 30;

        double surface = 2 * ((a * b) + (a * c) + (b * c));
        double volume = a * b * c;

        System.out.println("Surface Area: " + (int) surface);
        System.out.println("Volume: " + (int) volume);

    }

}
