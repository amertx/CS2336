
import java.util.*;

public class Q5_21 {

    public static void main(String[] args) {
	    // write your code here
        // local variables
        double loanAmount;
        double interestRate = .05;
        double percent = 0.0;
        double monthlyInterestRate;
        double monthlyPayment;
        double annualRate = 5.0;
        int years;

        //Scanner object creation
        Scanner kb = new Scanner(System.in);

        System.out.print("Loan amount: ");
        loanAmount = kb.nextDouble();

        System.out.print("Number of years: ");
        years = kb.nextInt();

        //Interest rate, monthly payment, total payment
        System.out.println("Interest Rate    Monthly Payment    Total Payment");
        System.out.println();

        for(int i = 0; i <= 24; i++){
            percent = interestRate * 100;
            System.out.printf("%.3f", percent);
            //monthlyPayment = loanAmount *
            System.out.print("%           ");
            monthlyInterestRate = percent/1200;
            monthlyPayment = loanAmount * monthlyInterestRate / (1
                    - 1 / Math.pow(1 + monthlyInterestRate, years * 12));
            System.out.printf("%-19.2f", monthlyPayment);
            System.out.printf("%-8.2f\n",(monthlyPayment * 12) * years);
            interestRate +=.00125;

        }

    }

}
