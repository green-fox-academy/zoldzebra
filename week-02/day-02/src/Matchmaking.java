import java.util.*;

public class Matchmaking{
  public static void main(String... args){
    ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve","Ashley","Bözsi","Kat","Jane"));
    ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe","Fred","Béla","Todd","Neef","Jeff"));

    // Write a method that joins the two lists by matching one girl with one boy into a new list
    // Exepected output: "Eve", "Joe", "Ashley", "Fred"...

    System.out.println(makingMatches(girls, boys));
    System.out.println("\n... and what should we do with Jeff?!? :D");
  }

  public static ArrayList makingMatches(ArrayList girls, ArrayList boys){
    ArrayList<String> matchedList = new ArrayList<String>();
    for (int i = 0; i < girls.size(); i++) {
      String girlname = (String) girls.get(i);
      String boyname = (String) boys.get(i);
      matchedList.add(i*2, girlname);
      matchedList.add((i*2) + 1, boyname);
    }
    return matchedList;
  }
}