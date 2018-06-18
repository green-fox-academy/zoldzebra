import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toMap;

public class Exercise7 {

  //Write a Stream Expression to find the frequency of characters in a given string!

  public static void main(String[] args) {
    String string = "Hello, my name is";
    System.out.println(getFreqs(string));
    System.out.println(getFreqs2(string));
  }
  // http://farenda.com/java/java-8-count-frequency-of-chars-in-string/
  public static Map<Character, Integer> getFreqs(String string) {
    Map<Character, Integer> frequencies = string.chars().boxed()
            .collect(toMap(
                    // key = char
                    k -> Character.valueOf((char) k.intValue()),
                    v -> 1,         // 1 occurence
                    Integer::sum)); // counting
    return frequencies;
  }

  public static Map<Character, Long> getFreqs2(String string) {
    return string.chars()
            .mapToObj(a -> (char) a)
            .collect(groupingBy(a -> a, Collectors.counting()));
  }
}
