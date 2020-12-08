import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Q13_4 {


    public static void main(String[] args) {
        //local variables
        int year, month = 0;

        //input checking
        if(args.length != 2){
            System.out.println("Please enter a new set of numbers");
            System.exit(1);
        }
        //enter i
        year = Integer.parseInt(args[1]);
        month = Integer.parseInt(args[0])-1;


        GregorianCalendar calendar = new GregorianCalendar(year, month, 1);
        //utilzing printCalendar object
        PrintCalendar.printMonth(calendar);

    }
}
