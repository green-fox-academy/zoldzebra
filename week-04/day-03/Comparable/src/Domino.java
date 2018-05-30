import java.util.Arrays;

public class Domino implements Comparable{
  private final int[] values;

  public Domino(int valueA, int valueB) {
    this.values = new int[]{valueA, valueB};
  }

  public int[] getValues() {
    return values;
  }

  @Override
  public String toString() {
    return "[" + values[0] + ", " + values[1] + "]";
  }

  @Override
  public int compareTo(Object o) {
    // OK, this works, but what is the relation between this and Collections.sort() in the main?
    Domino i = (Domino) o;
    return Integer.compare(this.values[0], i.values[0]);
  }
}
