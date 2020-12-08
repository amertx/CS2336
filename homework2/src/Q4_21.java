import java.util.*;
import java.lang.String;

public class Q4_21 {

    public static void main(String[] args) {
        //local variables
        String SSN;
        char SSNDigit;
        char[] digitArray;
        int length;
        char firstDash;
        char secondDash;
        char actualDash = '-';
        //Scanner object creation
        Scanner kb = new Scanner(System.in);

        //prompt
        System.out.print("Enter a SSN: ");
        SSN = kb.next();

        //length of string
        length = SSN.length();

        //conversion of String into individual characters
        digitArray = SSN.toCharArray();
        firstDash = digitArray[3];
        secondDash = digitArray[6];

        if((firstDash != actualDash && secondDash != actualDash) || (length < 11 || length > 11)){
            System.out.println(SSN + " is not a valid social security number");
        }else{
            System.out.println(SSN + " is a valid social security number");
        }







    }
}