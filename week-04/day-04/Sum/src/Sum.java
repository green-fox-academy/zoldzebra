import java.util.ArrayList;
import java.util.List;

public class Sum {

  public int sum(ArrayList<Integer> inputList) {
    int sum = 0;
    if (inputList == null) {
      sum = 0;
    } else {
      for (int i = 0; i < inputList.size(); i++) {
        sum += inputList.get(i);
      }
    }
    return sum;
  }
}
