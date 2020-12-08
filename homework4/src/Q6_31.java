
import javafx.scene.AmbientLight;

import java.util.*;

public class Q6_31 {

    public static void main(String[] args) {
	// write your code here
        //4388576018410707
        long creditCard;
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter a credit card as a long integer: ");
        creditCard = kb.nextLong();

        //output
        if(isValid(creditCard) == true){
            System.out.print(creditCard + " is valid");
        }else{
            System.out.print(creditCard + " is invalid");
        }

    }

    public static boolean isValid(long number){
        boolean visa = prefixMatched(number, 4);
        boolean masterCard = prefixMatched(number, 5);
        boolean AMEX = prefixMatched(number, 37);
        boolean discover = prefixMatched(number, 6);
        boolean sum = (sumOfDoubleEvenPlace(number) + sumOfDoubleOddPlace(number)) % 10 == 0;
        if(getSize(number) >= 13 && getSize(number) <= 16 && ((visa) || (masterCard) || (AMEX) || (discover)) &&
                (sum)){
            return true;
        }else{
            return false;
        }

    }

    public static int sumOfDoubleEvenPlace(long number){
        int sum = 0;

            for(int i = 0; i < 15; i++){
                if(i % 2 == 0){
                    sum+= getDigit((int)(number % 10) *2);
                }
                number /= 10;
            }

        return sum;
    }

    public static int getDigit(int number){
        int sum = ((number /10) + (number%10));
       if(number < 10){
           return number;
       }else{
           return (sum);
       }
    }

    public static int sumOfDoubleOddPlace(long number){
        int sum = 0;

        for(int i = 0; i < 15; i++){
            if(i % 2 == 1){
                sum+= getDigit((int)(number % 10) *2);
            }
            number /= 10;
        }

        return sum;
    }

    public static boolean prefixMatched(long number, int d){
        //checks if the digit d is a prefix for the parameter
        return getPrefix(number, getSize(d)) == d;
    }

    //retrieve the size of the long
    public static int getSize(long d){
        int counter = 0;
        while(d != 0){
            d/= 10;
            counter++;
        }
        return counter;
    }

    public static long getPrefix(long number, int k){
        int size = getSize(number);
        String digit = number + "";
        //only returns the parsing if the number is greater than k
        if(size > k){
            return Long.parseLong(digit.substring(0, k));
        }
        return number;
    }

}
