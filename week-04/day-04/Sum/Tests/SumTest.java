import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class SumTest {
  Sum test = new Sum();

  @Test
  public void doesItAdd(){
    ArrayList<Integer> testList = new ArrayList<Integer>();
    testList.add(1);
    testList.add(2);
    testList.add(3);

    int sum_expected = 1 + 2 + 3;
    int sum_result = test.sum(testList);
    assertEquals(sum_expected, sum_result);
  }

  @Test
  public void shouldReturnZeroIfInputIsEmptyList(){
    ArrayList<Integer> testList = new ArrayList<Integer>();
    int sum_expected = 0;
    int sum_result = test.sum(testList);
    assertEquals(sum_expected, sum_result);
  }

  @Test
  public void shouldReturnNumberIfOnlyElementIsNumber(){
    ArrayList<Integer> testList = new ArrayList<Integer>();
    int number = 88;
    testList.add(number);

    int sum_expected = number;
    int sum_result = test.sum(testList);
    assertEquals(sum_expected, sum_result);
  }

  @Test
  public void shouldReturnCorrectSumWithRandomNumberOfRandomElements(){
    ArrayList<Integer> testList = new ArrayList<Integer>();
    int maxRandom = 1000;
    int randomNumberOfElements = (int) (Math.random() * (maxRandom + 1));

    int sum_expected = 0;
    for (int i = 0; i < randomNumberOfElements; i++){
      int j = (int) (Math.random() * (maxRandom + 1));
      testList.add(i, j);
      sum_expected += j;
    }

    int sum_result = test.sum(testList);
    assertEquals(sum_expected, sum_result);
  }

  @Test
  public void shouldReturnZero_IfInputNull(){
    ArrayList<Integer> testList;
    testList = null;

    int sum_expected = 0;
    int sum_result = test.sum(testList);
    assertEquals(sum_expected, sum_result);
  }




}