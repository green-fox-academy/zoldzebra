// Given a string, compute recursively (no loops) a new string where all the
// lowercase 'x' chars have been changed to 'y' chars.

import java.util.Arrays;

public class Strings {

  public static void main(String[] args) {

    String string = "abcdefgXXxsfsaXxsdjklx";
    int counter = 0;
    String result = changeYtoX(getChars(string), counter);
    System.out.println(result);

  }

  public static char[] getChars(String string) {
    char[] chars = string.toCharArray();
    return chars;
  }

  public static String changeYtoX(char[] chars, int counter) {
    char x = 'x';
    char y = 'y';
    if (counter > chars.length-1){
      return String.valueOf(chars);
    } else {
      if (chars[counter] == x) {
        chars[counter] = y;
        counter++;
        return changeYtoX(chars, counter);
      } else {
        counter++;
        return changeYtoX(chars, counter);
      }
    }
  }
}
