import java.util.*;

public class Q4_17 {

    public static void main(String []args){
        int year;
        int days = 0;
        String month;
        boolean leapYear = false;
        //Scanner object
        Scanner kb = new Scanner(System.in);

        //prompt
        System.out.print("Enter a year: ");
        year = kb.nextInt();

        System.out.print("Enter a month: ");
        month = kb.next();

        //leap year
        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    leapYear = true;
                }else{
                    leapYear = false;
                }
            }else{
                leapYear = true;
            }
        }else{
            leapYear = false;
        }

        if(month.equals("Jan")){
            days = 31;
            System.out.println(month + " " + year + " has " + days + " days");

        }else if(month.equals("Feb")) {
            if(leapYear == true){
                days = 29;
            }else if(leapYear == false){
                days = 28;
            }
            System.out.println(month + " " + year + " has " + days + " days");

        }else if(month.equals("Mar")) {
            days = 31;
            System.out.println(month + " " + year + " has " + days + " days");

        }else if(month.equals("Apr")) {
            days = 30;
            System.out.println(month + " " + year + " has " + days + " days");

        }else if(month.equals("May")) {
            days = 31;
            System.out.println(month + " " + year + " has " + days + " days");

        }else if(month.equals("Jun")) {
            days = 30;
            System.out.println(month + " " + year + " has " + days + " days");

        }else if(month.equals("Jul")) {
            days = 31;
            System.out.println(month + " " + year + " has " + days + " days");

        }else if(month.equals("Aug")) {
            days = 31;
            System.out.println(month + " " + year + " has " + days + " days");

        }else if(month.equals("Sep")) {
            days = 30;
            System.out.println(month + " " + year + " has " + days + " days");

        }else if(month.equals("Oct")) {
            days = 31;
            System.out.println(month + " " + year + " has " + days + " days");

        }else if(month.equals("Nov")) {
            days = 30;
            System.out.println(month + " " + year + " has " + days + " days");

        }else if(month.equals("Dec")) {
            days = 31;
            System.out.println(month + " " + year + " has " + days + " days");

        }else{
            System.out.println("You have entered an invalid input");
        }

    }
}
