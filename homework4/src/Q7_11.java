
import java.util.*;

public class Q7_11 {

    public static void main(String[] args) {
        // write your code here
        // 1.9 2.5 3.7 2 1 6 3 4 5 2
        Scanner kb = new Scanner(System.in);
        double [] numbers = new double[10];
        System.out.print("Enter ten numbers: ");
        for(int i = 0; i < numbers.length; i++){
            //storing 10 values into array
            numbers[i] = kb.nextDouble();

        }

        //output of mean and standarad deviation
        System.out.print("The mean is ");
        System.out.printf("%.2f", mean(numbers));
        System.out.println();
        System.out.print("The standard deviation is ");
        System.out.printf("%.5f", deviation(numbers));

    }


    public static double deviation(double[] x){
        double std = 0;
        double sumSquared = 0;
        double size = x.length-1;
        // for loop to accumulate the sum squared
        for(int i = 0; i < x.length; i++){
            sumSquared = sumSquared + Math.pow((x[i] - mean(x)), 2);
        }
        //store deviation into variable (n-1) as denominator
        std = Math.sqrt(sumSquared / size);
        return std;
    }

    public static double mean(double[] x){
        double mean = 0;
        double sum = 0;

        //iterate through array
        for(int i = 0; i < x.length; i++){
            sum += x[i];
        }

        //calculate average
        mean = sum/10;

        return mean;
    }


}
