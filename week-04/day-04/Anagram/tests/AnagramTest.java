import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {

  @Test
  public void checkIfItComparesInputsCorrectly(){
    Anagram anagram = new Anagram();
    String input1 = "abcde";
    String input2 = "edcba";
    boolean expected = true;
    boolean result = anagram.anagram(input1, input2);
    assertEquals(expected, result);

  }

  @Test
  public void checkIfItHandlesSpaces(){
    Anagram anagram = new Anagram();
    String input1 = "abcd e";
    String input2 = "edcba";
    boolean expected = false;
    boolean result = anagram.anagram(input1, input2);
    assertEquals(expected, result);

  }

}