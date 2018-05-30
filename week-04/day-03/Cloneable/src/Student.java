/*
Check out what the Cloneable (java) or ICloneable (.aspx) interface is
Get your Student class from the Greenfox Organization Exercise
Make the Student implement the Cloneable interface
Implement the method, so it clones the student
Instantiate John, a 20 years old male from BME
Clone him
*/
public class Student extends Person implements Cloneable{

  String previousOrganization;
  int skippedDays;

  public Student(){
    super("Jane Doe", 30, "female");
    this.previousOrganization = "The School of Life";
    this.skippedDays = 0;
  }

  public Student(String name, int age, String gender, String previousOrganization){
    super(name, age, gender);
    this.previousOrganization = previousOrganization;
    this.skippedDays = 0;
  }


  public void introduce(){
    System.out.println("Hi, I'm " + this.name + ", " + this.age + " year old " + this.gender + " from " + previousOrganization + " who skipped "
            + this.skippedDays + " days from the course already.");
  }

  public void getGoal(){
    System.out.println("Be a junior software developer.");
  }

  public void skipDays(int numberOfDays){
    skippedDays += numberOfDays;
  }

  public Student clone(){
    Student cloneStudent = new Student(this.name, this.age, this.gender, this.previousOrganization);
    return cloneStudent;
  }

}