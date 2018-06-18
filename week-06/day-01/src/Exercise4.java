import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise4 {

  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(3, 9, 2, 8, 6, 5));
    System.out.println(getSquaredOver20(numbers));
  }

  public static List<Integer> getSquaredOver20(ArrayList<Integer> numbers) {
    return numbers.stream()
            .map(n -> n * n)
            .filter(n -> n > 20)
            .collect(Collectors.toList());
  }

}
