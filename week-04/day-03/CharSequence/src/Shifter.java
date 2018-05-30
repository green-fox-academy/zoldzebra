public class Shifter implements CharSequence{

  String input;
  int shiftSteps;

  public Shifter(String input, int shiftSteps){
    this.input = input;
    this.shiftSteps = shiftSteps;
  }

  @Override
  public int length() {
    return 0;
  }

  @Override
  public char charAt(int index) {
    // why this is not an infinite recursive call?
    return this.input.charAt(index + shiftSteps);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return null;
  }
}
