public class Gnirts implements CharSequence {

  String input;

  public Gnirts(String input){
    this.input = input;
  }

  @Override
  public int length() {
    return this.input.length();
  }

  @Override
  public char charAt(int index) {
    return this.input.charAt((this.input.length() - 1) - index);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return null;
  }
}
