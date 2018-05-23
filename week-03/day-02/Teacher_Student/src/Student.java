public class Student {

  String name;

  public Student(String name){
    this.name = name;
  }

  public void learn(){
    System.out.println(this.name + ": I'm learning.");
  }

  public void question(Teacher teacher){
    System.out.println(this.name + ": I have a question!");
    teacher.answer();
  }

}
