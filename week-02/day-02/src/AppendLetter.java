import java.util.*;

public class AppendLetter{
  public static void main(String... args){
    List<String> far = Arrays.asList("kuty", "macsk", "kacs", "rók", "halacsk");
    // Create a method called "appendA()" that adds "a" to every string in the "far" list.
    // The parameter should be a list.
    // The output should be: "kutya", "macska", "kacsa", "róka", "halacska"
    System.out.println(appendA(far));
  }

  public static List appendA(List far){
    String appender = "";
    for (int i = 0; i < far.size(); i++) {
      appender = (String) far.get(i);
      appender = appender.concat("a");
      far.set(i, appender);
    }
    return far;
  }

}

