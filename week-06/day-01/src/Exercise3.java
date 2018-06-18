import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise3 {

  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));
    System.out.println(getPositivesSquared(numbers));
  }

  public static List<Integer> getPositivesSquared(ArrayList<Integer> numbers) {
    return numbers.stream()
            .filter(number -> number > 0)
            .map(number -> number * number)
            .collect(Collectors.toList());
  }
}
