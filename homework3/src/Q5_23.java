import java.util.*;

public class Q5_23 {

    public static void main(String[] args) {
        //local variables
        double sumOfRightToLeft = 0.0;
        double sumOfLeftToRight = 0.0;
        double sumOfBothSeries;
        double counter = 0.0;



        //calculation of the summation from left to right
        for(counter = 1.0; counter <= 50000; counter++){
            sumOfLeftToRight += 1/ counter;
        }

        System.out.println("Results of the summation from left to right: " + sumOfLeftToRight);

        //calculation of the summation from right to left
        for(counter = 50000; counter >= 1; counter--){
            sumOfRightToLeft += 1/ counter;
        }

        System.out.println("Results of the summation from right to left: " + sumOfRightToLeft);

        //difference between the 2 is .000000001

    }
}