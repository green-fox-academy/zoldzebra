import java.util.ArrayList;

public class Cohort {

  String name;
  ArrayList<Student> students;
  ArrayList<Mentor> mentors;

  public int studentCounter = 0;
  public int mentorCounter = 0;

  public Cohort(String name){
    this.name = name;
    this.students = null;
    this.mentors = null;
  }

  public void addStudent(Student student){
    students.add(studentCounter, student);
    studentCounter++;
  }

  public void addMentor(Mentor mentor) {
    mentors.add(mentorCounter, mentor);
    mentorCounter++;
  }

  public void info(){
    System.out.println("The " + this.name + " cohort has " + students.size() + " students and " + mentors.size() +
    " mentors.");
  }
}
