import java.sql.SQLOutput;

public class CodingHours {

    public static void main(String[] args) {
        // An average Green Fox attendee codes 6 hours daily
        // The semester is 17 weeks long
        //
        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.
        //
        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52
        int dailyCodehours = 6;
        int semesterWeeks = 17;
        int workdaysPerWeek = 5;
        int holidaysKnown = 1;
        int workHoursWeekly = 52;

        int codingHoursSemester = (dailyCodehours * ((workdaysPerWeek * semesterWeeks) - holidaysKnown));

        System.out.println("Hours spent with coding per attendee in a semester: " + codingHoursSemester);
        System.out.println(  ( (float) codingHoursSemester / (semesterWeeks * workHoursWeekly ) ) * 100 +" %" );
        // also for percentage:
        // System.out.println( ( (float) dailyCodehours * workdaysPerWeek / workHoursWeekly ) * 100 + " %");
    }


}
