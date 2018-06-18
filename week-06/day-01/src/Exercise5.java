import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Stream;

public class Exercise5 {

  public static void main(String[] args) {
    String string = "AbCdEf";

    System.out.println(getUpperCase(string));
    System.out.println(getUpperCase2(string));
  }

  public static String getUpperCase(String string) {
    String[] chars = string.split("");

    return Arrays.stream(chars)
            .map(c -> c.charAt(0))
            .filter(c -> Character.isUpperCase(c))
            .map(c -> Character.toString(c))
            .reduce((letters, addletter) -> letters + addletter)
            .get();
  }

  public static String getUpperCase2(String string) {
    List<Character> chars = new ArrayList<Character>();
    for (int i = 0; i < string.length(); i++) {
      chars.add(string.charAt(i));
    }

    return chars.stream()
            .filter(c -> Character.isUpperCase(c))
            .map(c -> Character.toString(c))
            .reduce((letters, addletter) -> letters + addletter)
            .get();
  }

}
