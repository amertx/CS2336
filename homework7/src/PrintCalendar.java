import java.time.format.TextStyle;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;

public class PrintCalendar {

    public static void printMonth(GregorianCalendar cal) {
        // Print the headings of the calendar
        printMonthTitle(cal);
        // Print the body of the calendar
        printMonthBody(cal);
    }


    public static void printMonthTitle(GregorianCalendar cal) {
        System.out.println("         " + cal.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.ENGLISH) + " " + cal.get(Calendar.YEAR));
        System.out.println("-----------------------------");
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
    }


    public static void printMonthBody(GregorianCalendar cal) {
        // Get start day of the week for the first date in the month
        int startDay = cal.get(Calendar.DAY_OF_WEEK) - 1;
        // Get number of days in the month
        int numberOfDaysInMonth = cal.getActualMaximum(Calendar.DAY_OF_MONTH);

        // Pad space before the first day of the month
        for (int i = 0; i < startDay; i++)
            System.out.print("    ");

        for (int i = 1; i <= numberOfDaysInMonth; i++) {
            System.out.printf("%4d", i);

            if ((i + startDay) % 7 == 0)
                System.out.println();
        }

        System.out.println();
    }


}