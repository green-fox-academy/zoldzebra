// Create a function that takes 3 parameters: a path, a word and a number,
// than it should write to a file.
// The path parameter should be a string, that describes the location of the file.
// The word parameter should be a string, that will be written to the file as lines
// The number paramter should describe how many lines the file should have.
// So if the word is "apple" and the number is 5, than it should write 5 lines
// to the file and each line should be "apple"
// The function should not raise any error if it could not write the file.


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WriteMultipleLines {

  public static void main(String[] args) {
    String[] inputData = askForInput();
    createFile(inputData);
  }

  public static String[] askForInput (){
    Scanner scanner = new Scanner(System.in);
    String[] getInputData = new String[3];
    try {
      System.out.println("Please enter the location of your file!");
      getInputData[0] = scanner.next();
      System.out.println("Please enter the word for your file!"); // if multiple words entered it breaks :(
      getInputData[1] = scanner.next();
      System.out.println("Please enter the number of lines you want in the file!");
      getInputData[2] = scanner.next();
    } catch (Exception e) {
      System.out.println("Something went wrong. Try again!");
    }
    return getInputData;
  }

  public static void createFile (String[] getInputData) {

    try {
      List<String> lists = new ArrayList(Integer.valueOf(getInputData[2]));
      for (int i = 0; i < Integer.valueOf(getInputData[2]); i++) {
        lists.add(i, getInputData[1]);
      }
      Path filePath = Paths.get(getInputData[0]);
      Files.write(filePath, lists);
    } catch (IOException e) {
      System.out.println("IO error. Try again.");
    } catch (Exception e) {
      System.out.println("Other error. Try again.");
    }

  }
}
