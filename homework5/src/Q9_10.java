import java.util.*;

public class Q9_10 {

    public static void main(String[] args) {
        // write your code here
        //local variables
        double a, b, c;
        Scanner kb = new Scanner(System.in);

        //prompts
        System.out.print("Enter a, b, c values: ");
        a = kb.nextDouble();
        b = kb.nextDouble();
        c = kb.nextDouble();

        //instance creation
        QuadraticEquation quadObj = new QuadraticEquation(a, b, c);
        //if statement to check for discriminant values
        if(quadObj.getDiscriminant() < 0){
            System.out.println("The equation has no real roots");
        }else if(quadObj.getDiscriminant() > 0){
            System.out.println("R1: " + quadObj.getRoot1() + ", R2: " + quadObj.getRoot2());
        }else if(quadObj.getDiscriminant() == 0){
            System.out.println("The root is " + quadObj.getRoot1());
        }
    }
}

class QuadraticEquation{
    //private data fields
    private double a, b, c = 0;

    public QuadraticEquation(){

    }

    public QuadraticEquation(double aVal, double bVal, double cVal){
        a = aVal;
        b = bVal;
        c = cVal;
    }

    //getter methods
    public double getAValue(){
        return a;
    }

    public double getBValue(){
        return b;
    }

    public double getCValue(){
        return c;
    }

    //get Discriminant function
    public double getDiscriminant(){
        return b * b - 4.0 * a * c;
    }


    //retrieve root functions
    public double getRoot1(){
            return (-b + Math.sqrt(getDiscriminant())) / (2.0 * a);
    }


    public double getRoot2(){
            return (-b - Math.sqrt(getDiscriminant())) / (2.0 * a);

    }




}



