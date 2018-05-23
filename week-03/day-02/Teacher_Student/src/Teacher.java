public class Teacher {

  String teacherName;

  public Teacher(String teacherName){
    this.teacherName = teacherName;
  }

  public void teach(Student student){
    System.out.println(this.teacherName + ": I'm teaching serious skills, boys.");
    student.learn();
  }

  public void answer(){
    System.out.println(this.teacherName + ": You shouldn't talk so much, son.");
  }

}
