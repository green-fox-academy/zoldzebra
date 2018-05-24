// Given a non-negative int n, return the sum of its digits recursively (no loops).
// Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while
// divide (/) by 10 removes the rightmost digit (126 / 10 is 12).

public class SumDigit {

  public static void main(String[] args) {

    int sumDigits = calculateSumDigits(23456789, 0);
    System.out.println(sumDigits);

  }

  public static int calculateSumDigits(int n, int sum){
    if (n / 10 == 0){
      return sum + n;
    } else {
      sum += n % 10;
      return calculateSumDigits(n / 10, sum);
    }
  }

}
