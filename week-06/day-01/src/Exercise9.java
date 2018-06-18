import java.nio.CharBuffer;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Exercise9 {

  //Write a Stream Expression to convert a char array to a string!

  public static void main(String[] args) {

    Character[] chars = {'a', 'b', 'c', 'd', 'e'};
    char[] chars2 = {'a', 'b', 'c', 'd', 'e'};
    System.out.println(makeString(chars));

  }

  public static String makeString(Character[] chars) {
    return Arrays.stream(chars)
            .map(c -> Character.toString(c))
            .reduce((letter, nextLetter) -> letter + nextLetter)
            .get();
  }
}
