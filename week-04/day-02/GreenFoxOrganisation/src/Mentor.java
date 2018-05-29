
public class Mentor extends Person {

  String level;

  public Mentor(){
    super("Jane Doe", 30, "female");
    this.level = "intermediate";
  }

  public Mentor(String name, int age, String gender, String level){
    super(name, age, gender);
    this.level = level;
  }

  public void introduce(){
    System.out.println("Hi, I'm " + this.name + ", " + this.age + " year old " + this.gender + " " + this.level + " mentor.");
  }

  public void getGoal(){
    System.out.println("Educate brilliant junior software developers.");
  }

}