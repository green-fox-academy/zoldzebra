import java.util.ArrayList;

/*

Create a Cohort class that has the following

fields:
name: the name of the cohort
students: a list of Students
mentors: a list of Mentors
methods:
addStudent(Student): adds the given Student to students list
addMentor(Mentor): adds the given Mentor to mentors list
info(): prints out "The name cohort has students.size() students and mentors.size() mentors."
The Cohort class has the following constructors:

Cohort(name): beside the given parameter, it sets students and mentors as empty lists

 */
public class Cohort {

  String name;
  ArrayList<Student> students;
  ArrayList<Mentor> mentors;

  int studentCounter = 0;
  int mentorCounter = 0;

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
