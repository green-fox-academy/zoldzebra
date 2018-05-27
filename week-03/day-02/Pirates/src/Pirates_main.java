public class Pirates_main {

  public static void main(String[] args) {

    Pirate pirate00 = new Pirate();
    Pirate pirate01 = new Pirate("Johnny");
    Pirate pirate02 = new Pirate("Katie");
    Pirate pirate03 = new Pirate();
    Pirate pirate04 = new Pirate();
    Pirate pirate05 = new Pirate();

    pirate00.brawl(pirate01);
    pirate02.brawl(pirate03);

    //pirate00.howsItGoingMate();
    //pirate01.howsItGoingMate();
    //pirate02.howsItGoingMate();
    //pirate03.howsItGoingMate();
    //pirate04.howsItGoingMate();
  }

}
