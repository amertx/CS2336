import java.util.*;

public class Q18_2 {

    public static void main(String[] args) {
	    // write your code here
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter an index for a Fibonacci number: ");
        int index = kb.nextInt();

        //output
        System.out.println("The Fibonacci number at index " + index + " is " + fib(index));

    }

    public static long fib(long index){
        int f0 = 0;
        int f1 = 1;
        int currentFib;

        //base case checking iteratively
        if(index == 0){
            return 0;
        }

        if(index == 1){
            return 1;
        }

        //post loop
        for(int i = 1; i < index; i++){
            currentFib = f0 + f1;
            f0 = f1;
            f1 = currentFib;
        }

        return f1;

    }
}
