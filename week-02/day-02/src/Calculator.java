import java.util.Scanner;

public class Calculator {
  public static void main(String... args) {
    // Create a simple calculator application which reads the parameters from the prompt
    // and prints the result to the prompt.
    // It should support the following operations,
    // create a method named "calculate()":
    // +, -, *, /, % and it should support two operands.
    // The format of the expressions must be: {operation} {operand} {operand}.
    // Examples: "+ 3 3" (the result will be 6) or "* 4 4" (the result will be 16)

    // You can use the Scanner class
    // It should work like this:

    // Start the program
    // It prints: "Please type in the expression:"
    // Waits for the user input
    // Print the result to the prompt
    // Exit
  Scanner scanner = new Scanner(System.in);
  System.out.println("Please type in the expression:");
  String inputs = scanner.nextLine();
  System.out.println(calculate(inputs));
  }

  public static double calculate (String inputs){
    // cutting out the numbers as strings from the input string
    int separator1 = inputs.indexOf(" ");
    int separator2 = inputs.lastIndexOf(" ");
    // getting a and b as doubles
    double a = 0;
    double b = 0;
    String aString = "";
    String bString = "";
    for (int i = separator1; i < separator2; i++) {
      aString = inputs.substring(separator1+1, separator2);
    }
    for (int i = 0; i < (inputs.length()-separator2); i++) {
      bString = inputs.substring(separator2+1, inputs.length());
    }
    a = Double.valueOf(aString);
    b = Double.valueOf(bString);
    // checking the operator and feeding back the input calculation
    String operator = String.valueOf(inputs.charAt(0));
    System.out.println("Calculating " + a + " " + operator + " " + b + " =");
    // calculating
    double calculation = 0;
    if (operator.equals("+")) {
      calculation = a + b;
    } else if (operator.equals("-")) {
      calculation = a - b;
    } else if (operator.equals("/")) {
      calculation = a / b;
    } else if (operator.equals("*")) {
      calculation = a * b;
    } else if (operator.equals("%")) {
      calculation = a % b;
    }
    return calculation;
  }
}