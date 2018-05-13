public class BMI {

    public static void main(String[] args) {
        double massInKg = 81.2;
        double heightInM = 1.78;

        // Print the Body mass index (BMI) based on these values

        // BMI =  testtömeg (kg) / tesmagasság (m)^2

        double BMI = massInKg / (Math.pow(heightInM , 2));
        // wo/ Math.pow method the line above:
        // double BMI = massInKg / (heightInM*heightInM);

        System.out.println("Mass (kg): " + massInKg);
        System.out.println("Height (m): " + heightInM);
        System.out.println("BMI = " + BMI);

    }

}
