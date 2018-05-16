// Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class CountLines {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String inputFileName = scanner.next();
    System.out.println("Number of lines: " + numberOfLines(inputFileName));

  }

  public static int numberOfLines (String inputFileName){
    int noOfLines = 0;
    try {
      Path fileName = Paths.get(inputFileName);
      List<String> list = Files.readAllLines(fileName);
      for (String s : list) {
        noOfLines++;
      }
    } catch (IOException e) {
      noOfLines = 0;
      return noOfLines;
    } catch (Exception e) {
      //System.out.println("Some error detected (not IO related)");
    } finally {
      //System.out.println("Method executed");
    }
    return noOfLines;
  }

}
