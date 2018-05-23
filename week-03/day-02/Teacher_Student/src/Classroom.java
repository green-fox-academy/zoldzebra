/*
Create Student and Teacher classes
Student
learn()
question(teacher) -> calls the teachers answer method
Teacher
teach(student) -> calls the students learn method
answer()
 */

public class Classroom {

  public static void main(String[] args) {

    Teacher teacher0 = new Teacher("Lajos bácsi a tesitanár");
    Student student0 = new Student("Bécike");

    teacher0.teach(student0);
    student0.question(teacher0);

  }

}
