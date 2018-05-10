// Loads the scanner to the file
import java.util.Scanner;

public class tester {

    public static void main(String[] args) {
        int d = 7;
        int time = 201;
        String out3 = "";
        // if d is dividable by 4
        // and time is not more than 200
        // set out3 to "check"
        // if time is more than 200
        // set out3 to "Time out"
        // otherwise set out3 to "Run Forest Run!"
        if (((d % 4) == 0) && (time <= 200)){
            out3 = "check";
        } else if (time > 200){
            out3 = "Time out";
        } else {
            out3 = "Run Forest Run!";
        }


        System.out.println(out3);

    }
}

