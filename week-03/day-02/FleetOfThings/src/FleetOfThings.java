public class FleetOfThings {

  public static void main(String[] args) {
    Fleet fleet = new Fleet();

    Thing thing0 = new Thing("Get milk");
    Thing thing1 = new Thing("Remove the obstacles");
    Thing thing2 = new Thing("Stand up");
    Thing thing3 = new Thing("Eat lunch");

    fleet.add(thing0);
    fleet.add(thing1);
    fleet.add(thing2);
    fleet.add(thing3);

    thing2.complete();
    thing3.complete();

    // Create a fleet of things to have this output:
    // 1. [ ] Get milk
    // 2. [ ] Remove the obstacles
    // 3. [x] Stand up
    // 4. [x] Eat lunch

    System.out.println(fleet);
  }
}