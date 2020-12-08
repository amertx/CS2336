import java.util.*;

public class Q5_22 {

    public static void main(String[] args) {
        //local variables
        // local variables
        double loanAmount;
        double interest = 0.0;
        double principal = 0.0;
        double balance;
        double interestRate = .05;
        double percent = 0.0;
        double monthlyInterestRate;
        double monthlyPayment;
        double annualRate;
        double totalPayment;
        int years;

        //Scanner object creation
        Scanner kb = new Scanner(System.in);

        System.out.print("Loan amount: ");
        loanAmount = kb.nextDouble();

        System.out.print("Number of years: ");
        years = kb.nextInt();

        System.out.print("Annual Interest Rate: ");
        annualRate = kb.nextDouble();

        System.out.println();

        //monthly payment output
        monthlyInterestRate = annualRate/1200;
        monthlyPayment = loanAmount * monthlyInterestRate /(1-1 / Math.pow(1+ monthlyInterestRate, years * 12)) ;
        System.out.printf("Monthly Payment: %.2f" , monthlyPayment);
        System.out.println();

        //total payment
        totalPayment = (monthlyPayment *12) * years;
        System.out.printf("Total Payment: %.2f" , totalPayment);
        System.out.println();
        System.out.println();

        //default for variables
        balance = loanAmount;

        //table for payment #, Interest, Principal, Balance
        System.out.println("Payment#     Interest     Principal     Balance");
        for(int i = 1; i <= years * 12; i ++){
            interest = monthlyInterestRate * balance;
            principal = monthlyPayment - interest;
            balance -= principal;
            System.out.printf("%-13d%-13.2f%-13.2f%8.2f", i, interest,
                    principal, balance);
            System.out.println();
        }

    }
}