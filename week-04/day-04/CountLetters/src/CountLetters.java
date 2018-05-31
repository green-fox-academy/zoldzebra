/*
Write a function, that takes a string as an argument and returns a dictionary with all letters in the string as keys, and numbers as values that shows how many occurrences there are.
Create a test for that.
 */

import java.util.Arrays;
import java.util.HashMap;

public class CountLetters {

  public HashMap dictionary(String input){
    HashMap<Character, Integer> dictionary = new HashMap<Character, Integer>();
    input = input.toLowerCase();
    char[] chars = input.toCharArray();
    Arrays.sort(chars);

    for (int i = 0; i < chars.length; i++) {
      int j = i;
      int letterCounter = 1;
      if (chars[i] == chars[chars.length-1]) {
        if (chars[i] != chars[i - 1]) {
          dictionary.put(chars[i], 1);
        } else {
          dictionary.put(chars[i], dictionary.get(chars[i]) + 1);
        }
      } else if (chars[i] == chars[i+1]) {
          while (chars[i] == chars[j]) {
            dictionary.put(chars[i], letterCounter);
            letterCounter++;
            j++;
          }
      } else if (chars[i] != chars[i-1]){
        dictionary.put(chars[i], 1);
      }
    }
    return dictionary;
  }
}

