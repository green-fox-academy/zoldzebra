import java.util.Arrays;

public class Anagram {

  public boolean anagram(String string1, String string2){
    boolean anagram;
    char[] first = string1.toCharArray();
    char[] second = string2.toCharArray();

    Arrays.sort(first);
    Arrays.sort(second);

    anagram = Arrays.equals(first, second);
    return anagram;
  }
}
