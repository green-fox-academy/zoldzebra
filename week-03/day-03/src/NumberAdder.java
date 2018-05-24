// Write a recursive function that takes one parameter: n and adds numbers from 1 to n.

public class NumberAdder {

  public static void main(String[] args) {

    int sum = Adder(5);
    System.out.println(sum);

  }

  public static int Adder(int n){
    int sum = 0;
    if (n == 1){
      return 1;
    } else {
      sum = n + Adder(n - 1);
      return sum;
    }


  }

}
