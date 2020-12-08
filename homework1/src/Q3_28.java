
import sun.nio.ch.sctp.SctpNet;

import java.util.*;

public class Q3_28 {

    public static void main(String[] args) {
        //local variables
        double x1, y1 = 0;
        double width1, height1 = 0;

        double x2, y2 = 0;
        double width2, height2 = 0;

        double boundariesXPositive = 0;
        double boundariesXNegative = 0;

        double boundariesYPositive = 0;
        double boundariesYNegative = 0;

        double boundariesX2Positive = 0;
        double boundariesX2Negative = 0;

        double boundariesY2Positive = 0;
        double boundariesY2Negative = 0;


        //Scanner creation
        Scanner kb = new Scanner(System.in);

        //prompt for x, y, width and height coordinates
        System.out.print("Enter r1's center x-, y-coordinates, width, and height: ");
        x1 = kb.nextDouble();
        y1 = kb.nextDouble();
        width1 = kb.nextDouble();
        height1 = kb.nextDouble();
        width1 /= 2;
        height1 /= 2;

        //prompt for x2, y2, width2 and height2 coordinates
        System.out.print("Enter r2's center x-, y-coordinates, width, and height: ");
        x2 = kb.nextDouble();
        y2 = kb.nextDouble();
        width2 = kb.nextDouble();
        height2 = kb.nextDouble();
        width2 /= 2;
        height2 /= 2;

        //boundaries for rectangle 1
        boundariesXPositive = x1 + width1;
        boundariesXNegative = x1 - width1;
        boundariesYPositive = y1 + height1;
        boundariesYNegative = y1 - height1;

        //boundaries for rectangle 2
        boundariesX2Positive = x2 + width2;
        boundariesX2Negative = x2 - width2;
        boundariesY2Positive = y2 + height2;
        boundariesY2Negative = y2 - height2;

        //validation for overlapping or not
        if(boundariesXPositive <= boundariesX2Positive && boundariesXNegative >= boundariesX2Negative && boundariesYPositive <= boundariesY2Positive &&
                boundariesYNegative >= boundariesY2Negative){
            //r1 into r2 case
            System.out.println("r1 is inside r2");
        }else if(boundariesXPositive >= boundariesX2Positive && boundariesXNegative <= boundariesX2Negative && boundariesYPositive >= boundariesY2Positive &&
                boundariesYNegative <= boundariesY2Negative){
            //r2 into r1 case
            System.out.println("r2 is inside r1");
        }else if(boundariesXPositive < boundariesX2Negative || boundariesXNegative > boundariesX2Positive || boundariesYPositive < boundariesY2Negative ||
                boundariesY2Negative > boundariesYPositive){
            //does not overlap case
            System.out.println("r2 does not overlap with r1");
        }else{
            //overlap case
            System.out.println("r2 overlaps r1");
        }
        

    }
}
