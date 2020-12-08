

import java.util.*;

public class Q3_1 {

    public static void main(String[] args) {
	    // write your code here
        Scanner kb = new Scanner(System.in);
        //local variables
        double a = 0;
        double b = 0;
        double c = 0;
        double discriminant = 0;
        boolean discriminantValidation;
        double root1 = 0;
        double root2 = 0;

        //prompts for a, b, c
        System.out.print("Enter a, b, c: ");
        a = kb.nextDouble();
        b = kb.nextDouble();
        c = kb.nextDouble();

        //calculate discriminant
        double bSquared = Math.pow(b, 2);
        discriminant = bSquared-4*a*c;

        if(discriminant > 0){
            //quadratic equation
            root1 = (-b+Math.sqrt(discriminant))/(2*a);
            root2 = (-b-Math.sqrt(discriminant))/(2*a);
            System.out.print("The equation has two roots: ");
            System.out.printf("%.6f" , root1);
            System.out.print(" and ");
            System.out.printf("%.6f" , root2);
        }else if(discriminant == 0){
            root1 = (((-b)+Math.pow(discriminant,0.5))/(2*a));
            System.out.print("The equation has one root: ");
            System.out.printf("%.0f" , root1);

        }else{
            System.out.println("The equation has no real roots");
        }
    }
}
