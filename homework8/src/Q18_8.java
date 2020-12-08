import java.util.Scanner;

public class Q18_8 {

    public static void main(String[] args) {
        // write your code here
        int number;
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = kb.nextInt();

        System.out.print("Reversal is: ");
        reverseInteger(number);

    }

    public static void reverseInteger(int value){
        //output each digit in reverse from right most
        System.out.print(value % 10);
        if (value >= 10) {
            reverseInteger(value / 10);
        }
    }
}
