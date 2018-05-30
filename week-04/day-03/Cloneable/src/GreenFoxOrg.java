import java.util.ArrayList;

public class GreenFoxOrg {

  public static void main(String[] args) {

    Student student0 = new Student("John", 20, "male", "BME");

    System.out.println(student0);
    System.out.println(student0.clone());

    student0.introduce();
    student0.clone().introduce();

  }
}
