import java.util.*;

public class ElementFinder{
  public static void main(String... args){
    ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
    System.out.println(containsSeven(arrayList));
    System.out.println(containsSeven2(arrayList));
    // Write a method that checks if the arrayList contains "7" if it contains return "Hoorray" otherwise return "Noooooo"
    // The output should be: "Noooooo"
    // Do this again with a different solution using different list methods!

  }
// Solution 1 using contains() method:
  public static String containsSeven (ArrayList arrayList){
    boolean containsSevenTruth = arrayList.contains(Integer.valueOf(7));
    String theTruth = "";
    if (containsSevenTruth == true) {
      theTruth = "Hoorray";
    } else {
      theTruth = "Noooooo";
    }
    return theTruth;
  }

  // Solution 2 using indexOf() method:
  public static String containsSeven2 (ArrayList arrayList){
    int signal = arrayList.indexOf(Integer.valueOf(7));
    String theTruth = "";
    if ( signal <= 0) {
      theTruth = "Nooooo";
    } else {
      theTruth = "Hoorray";
    }
    return theTruth;
  }
}