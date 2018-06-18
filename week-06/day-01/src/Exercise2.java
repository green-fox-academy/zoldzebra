import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise2 {

  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));
    System.out.println(getAverageOfOdds(numbers));

  }

  public static double getAverageOfOdds(ArrayList<Integer> numbers){
    return numbers.stream()
            .filter(number -> number % 2 == 1 || number % 2  == -1 )
            .mapToInt(number -> number)
            .average()
            .getAsDouble();
  }

}
