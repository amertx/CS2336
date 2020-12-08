import javax.swing.plaf.synth.SynthEditorPaneUI;
import java.util.*;
import java.lang.String;

public class Q4_23 {

    public static void main(String[] args) {
        //local variables
        String employeeName;
        int numHoursWorked;
        double hourlyRate;
        double federalTaxHoldRate;
        double stateTaxHoldRate;
        double grossPay;
        double federalDeduction;
        double stateDeduction;
        double totalDeductions;
        double nextPay;
        //Scanner object creation
        Scanner kb = new Scanner(System.in);

        //prompts
        System.out.print("Enter employee's name: ");
        employeeName = kb.next();

        System.out.print("Enter number of hours worked in a week: ");
        numHoursWorked = kb.nextInt();

        System.out.print("Enter hourly pay rate: ");
        hourlyRate = kb.nextDouble();

        System.out.print("Enter federal tax withholding rate: ");
        federalTaxHoldRate = kb.nextDouble();

        System.out.print("Enter state tax withholding rate: ");
        stateTaxHoldRate = kb.nextDouble();

        System.out.println();


        //outputs of calculations
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Hours Worked: " + numHoursWorked);
        System.out.println("Pay Rate: $" + hourlyRate);
        grossPay = hourlyRate * numHoursWorked;
        System.out.println("Gross Pay: $" + grossPay);
        System.out.println("Deductions: ");

        //federal & state tax withholding
        federalDeduction = federalTaxHoldRate * grossPay;
        System.out.println("  Federal Withholding " + '(' + (federalTaxHoldRate*100) + '%' + ')' + ':' + " $" + federalDeduction);
        stateDeduction = stateTaxHoldRate * grossPay;
        String formatState = String.format("%.2f", stateDeduction);
        System.out.println("  State Withholding " + '(' + (stateTaxHoldRate*100) + '%' + ')' + ':' + " $" +formatState);
        totalDeductions = federalDeduction + stateDeduction;
        String formatTotal = String.format("%.2f", totalDeductions);
        System.out.println("Total deductions: $" + formatTotal);
        nextPay = grossPay-totalDeductions;
        String formatNextPay = String.format("%.2f", nextPay);
        System.out.println("Next Pay: $" + formatNextPay);

    }
}