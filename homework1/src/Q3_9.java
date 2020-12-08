
import java.util.*;

public class Q3_9 {

    public static void main(String[] args) {
        //local variables
        int isbnNumber;
        int isbnOriginal;
        char xDigit = 'X';
        double checkSum = 0;
        int d1, d2, d3, d4, d5, d6, d7, d8, d9, d10;

        //scanner object creation
        Scanner kb = new Scanner(System.in);

        //prompt
        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        isbnNumber = kb.nextInt();

        //modulus and integer divison to retrieve each digit
        d9 = isbnNumber % 10;
        isbnNumber /= 10;

        d8 = isbnNumber % 10;
        isbnNumber /= 10;

        d7 = isbnNumber % 10;
        isbnNumber /= 10;

        d6 = isbnNumber % 10;
        isbnNumber /= 10;

        d5 = isbnNumber % 10;
        isbnNumber /= 10;

        d4 = isbnNumber % 10;
        isbnNumber /= 10;

        d3 = isbnNumber % 10;
        isbnNumber /= 10;

        d2 = isbnNumber % 10;
        isbnNumber /= 10;

        d1 = isbnNumber % 10;
        isbnNumber /= 10;

        //d10 calculation
        d10 = ((d1* 1) + (d2 * 2) + (d3 * 3) + (d4* 4) + (d5 * 5) +(d6 *6) +
                (d7 * 7) + (d8*8) + (d9*9)) % 11;

        System.out.print("The ISBN-10 number is " + d1 + "" + d2 + "" + d3 + "" + d4 + "" + d5 + "" + d6 + "" + d7 + "" + d8 + "" + d9);
        if(d10 == 10){
            System.out.println(xDigit);
        }else{
            System.out.println(d10);
        }


    }

}
