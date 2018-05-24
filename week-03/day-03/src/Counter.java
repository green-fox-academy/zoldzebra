public class Counter {

  public static void main(String[] args) {

    int counterRec = counterWithRec(5);
    System.out.println(counterRec + " and thats where I print this");

  }

  public static void counterWithFor(int n){
    for (int i = 0; i < n; i++){
      System.out.println(n - i);
    }
  }

  public static int counterWithRec(int n){
    if (n == 1){
      return 1;
    } else {
      System.out.println(n);
      return counterWithRec(n - 1);
    }

  }


}
