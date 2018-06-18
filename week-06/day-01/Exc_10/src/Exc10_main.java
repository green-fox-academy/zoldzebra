import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exc10_main {

  public static void main(String[] args) {

    List<Fox> foxes = new ArrayList<>();
    foxes.add(new Fox("Béla", "pallida", "green"));
    foxes.add(new Fox("Lajos", "fulvipes", "yellow"));
    foxes.add(new Fox("Mihály", "pallida", "blue"));
    foxes.add(new Fox("Sándor", "fulvipes", "green"));
    foxes.add(new Fox("Oszkár", "pallida", "green"));

    System.out.println(getGreenPallidas(foxes));
  }


  public static List<Fox> getGreenPallidas(List<Fox> foxes) {
    return foxes.stream()
            .filter(fox -> fox.color.equals("green") && fox.type.equals("pallida"))
            .collect(Collectors.toList());
  }

}
