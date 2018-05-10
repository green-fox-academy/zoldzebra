public class SecondsInaDay {

    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented by the variables

        int totalDailySeconds = 60 * 60 * 24;
        int elapsedSeconds = (3600 * currentHours) + (60 * currentMinutes) + currentSeconds;
        int remainingSeconds = totalDailySeconds - elapsedSeconds;

        System.out.println("Remaining seconds: " + remainingSeconds);

    }

}
