import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise6 {

  //Write a Stream Expression to find the strings which starts with A and ends with I in the following array:

  public static void main(String[] args) {
    ArrayList<String> cities = new ArrayList<>(Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH",
            "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS"));

    System.out.println(getAICities(cities));
  }

  public static List<String> getAICities(ArrayList<String> cities) {
    return cities.stream()
            .filter(city -> city.charAt(0) == 'A' && city.charAt(city.length() - 1) == 'I')
            .collect(Collectors.toList());
  }
}
