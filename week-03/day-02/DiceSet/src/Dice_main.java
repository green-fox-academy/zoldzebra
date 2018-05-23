import java.util.Arrays;

public class Dice_main {

  public static void main(String[] args) {

    int rerolls = 0;

    DiceSet diceSet = new DiceSet();
    diceSet.roll();
    System.out.println("Original roll: " + Arrays.toString(diceSet.dices));

    for (int i = 0; i < diceSet.dices.length; i++) {
      while (diceSet.getCurrent()[i] != 6){
        diceSet.reroll(i);
        rerolls ++;
      }
    }

    System.out.println("Finally, after a total of " + rerolls + " single dice rerolls: " + Arrays.toString(diceSet.dices));


    /*
    diceSet.getCurrent();
    diceSet.getCurrent();
    diceSet.getCurrent(5);
    diceSet.reroll();
    diceSet.getCurrent();
    diceSet.reroll(4);
    diceSet.getCurrent();
    */
  }

}
