import java.util.*;

public class Q18_21 {

    public static void main(String[] args) {
        // write your code here
        Scanner kb = new Scanner(System.in);
        int number;

        System.out.print("Enter a decimal number: ");
        number = kb.nextInt();

        System.out.print("The numebr in binary is: " + dec2bin(number));


    }

    public static String dec2bin(int value){
        String result = "";

        //base case
        if(value == 0 || value == 1){
            result = "" + value;
        }else{
            //resursive step
            result = result + dec2bin(value / 2) + value % 2;
        }

        return result;


    }
}
