import java.util.*;

public class Q9_7 {


    public static void main(String[] args) {
        // write your code here
        //instance creation

        Account account = new Account(1122, 20000);
        System.out.println("Balance before withdrawal: $" + account.getBalance());
        account.setAnnualInterestRate(4.5);
        account.withDraw(2500);
        account.deposit(3000);
        System.out.println("Balance: $" + account.getBalance());
        System.out.println("Monthly Interest: $" + account.getMonthlyInterest());
        System.out.println("Date Created: " + account.getDateCreated());
    }
}

class Account{
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private Date dateCreated;

    public Account(){
        //ask about calling this() in the other constructor
    }

    public Account(int newID, double newBalance){
        dateCreated = new Date();
        id = newID;
        balance = newBalance;
    }

    //setters
    public void setId(int newID){
        id = newID;
    }

    public void setBalance(double newBalance){
        balance = newBalance;
    }

    public void setAnnualInterestRate(double newAnnualInterestRate){
        annualInterestRate = newAnnualInterestRate;
    }

    //getters
    public int getId(){
        return id;
    }

    public double getBalance(){
        return balance;
    }

    public double getAnnualInterestRate(){
        return annualInterestRate;
    }

    public Date getDateCreated(){
        return dateCreated;
    }

    public double getMonthlyInterestRate(){
        return (annualInterestRate/100)/12;
    }

    public double getMonthlyInterest(){
        return balance * getMonthlyInterestRate();
    }

    public double withDraw(double amount){
        balance = balance - amount;
        return balance;
    }

    public double deposit(double amountDeposited){
        balance = balance + amountDeposited;
        return balance;
    }


}
