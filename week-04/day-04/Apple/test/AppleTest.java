import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppleTest {

  Apple apple = new Apple();

  @Test
  public void doesItPrintApple(){
    String expected = "apple";
    String result = apple.apple();
    assertEquals(expected, result);
  }

}