
import java.util.*;

public class Q3_22 {

    public static void main(String[] args) {
        //local variables
        double differenceBetweenDistancesX = 0;
        double differenceX;
        double differenceBetweenDistancesY = 0;
        double differenceY;
        double distance = 0;
        int radius = 10;
        double x, x2, y, y2;

        //Scanner creation
        Scanner kb = new Scanner(System.in);

        //prompt for 2 coordinates
        System.out.print("Enter a point with two coordinates: ");
        x2 = kb.nextDouble();
        y2 = kb.nextDouble();

        //center
        x = 0;
        y = 0;

        //equation for distance
        differenceX = x2-x;
        differenceBetweenDistancesX = Math.pow(differenceX,2);

        differenceY = y2-y;
        differenceBetweenDistancesY = Math.pow(differenceY,2);

        distance = Math.sqrt(differenceBetweenDistancesX+ differenceBetweenDistancesY);

        //checks if distance value is in circle or not
        if(distance <= 10){
            System.out.println("Point " + '(' + x2 + ", " + y2 + ')' + " is in the circle");
        }else{
            System.out.println("Point " + '(' + x2 + ", " + y2 + ')' + " is not in the circle");

        }



    }
}
