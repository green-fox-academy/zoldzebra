public class Aircraft_carriers_main {

  public static void main(String[] args) {

    Aircraft fighter0 = new F16();

    System.out.println(fighter0.getType());;
    System.out.println(fighter0.getStatus());
    System.out.println(fighter0.isPriority());

    Aircraft_Carrier carrier0 = new Aircraft_Carrier("JFK", 3000, 1500);
    carrier0.add(fighter0);

    carrier0.getStatus();


  }
}
