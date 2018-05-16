// Write a function that copies a file to an other
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Copy {
  public static void main(String[] args) {
    String[] fileNames = askForInput2();
    System.out.println("Successful copying? " + fileCopyMethod(fileNames));
  }

  public static String[] askForInput2 () {
    Scanner scanner = new Scanner(System.in);
    String[] fileNameInputs = new String[2];

    System.out.println("Type in filename 1:");
    fileNameInputs[0] = scanner.next();
    System.out.println("Type in filename 2:");
    fileNameInputs[1] = scanner.next();

    return fileNameInputs;
  }

  public static boolean fileCopyMethod (String[] fileNames) {
    boolean copySuccess = false;
    try {
      Path copyFrom = Paths.get(fileNames[0]);
      Path copyTo = Paths.get(fileNames[1]);
      List<String> fileContent = Files.readAllLines(copyFrom);
      for (String s : fileContent) {
        Files.write(copyTo, fileContent);
      }
      copySuccess = true;
    } catch (IOException e) {
      copySuccess = false;
    }
    return copySuccess;
  }
}
