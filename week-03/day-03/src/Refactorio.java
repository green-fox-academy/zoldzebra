// Create a recursive function called `refactorio`
// that returns it's input's factorial

public class Refactorio {

  public static void main(String[] args) {

    int n = 6;
    System.out.println(refactorio(n));

  }

  public static int refactorio(int n){
    if (n == 1){
      return 1;
    } else {
      return n * refactorio(n-1);
    }
  }

}
