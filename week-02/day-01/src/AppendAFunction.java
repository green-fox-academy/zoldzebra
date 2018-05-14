//  Create the usual class wrapper
//  and main method on your own.

// - Create a string variable named `am` and assign the value `kuty` to it
// - Write a function called `appendA` that gets a string as an input,
//   appends an 'a' character to its end and returns with a string
//
// - Print the result of `appendAFunc(am)`

public class AppendAFunction {

  public static void main(String[] args) {

    String am = "kuty";

    //appendA(am);

    System.out.println(appendA(am));


  }

  private static String appendA(String stringToAppend) {

    stringToAppend = stringToAppend + "a";
    return stringToAppend;
  }

}
