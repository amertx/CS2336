
import java.util.*;

public class Q10_7 {

    public static void main(String[] args) {
        // write your code here
        //Scanner creation
        int id;
        double withDrawalAmount;
        double depositAmount;
        Scanner kb = new Scanner(System.in);
        Account [] account = new Account[10];
        //iterate through 10 instances and 0-9 ids with initial balance of 100
        for(int i = 0; i < account.length; i++){
            account[i] = new Account(i);
        }
        //prompt user
        System.out.print("Enter an id: ");
        id = kb.nextInt();

        //boolean condition
        boolean exit = false;
        while(true){
            //local variables
            int menuChoice;
            //incorrect case
            if(id > 9 || id < 0){
                System.out.print("Incorrect ID, please re-enter: ");
                id = kb.nextInt();
            }
            //if the id is a direct match
            if(id == account[id].getId()){
                //menu is outputted
                System.out.println();
                System.out.println("Please enter an option below:");
                System.out.println("1) View Current Balance");
                System.out.println("2) Withdraw Money");
                System.out.println("3) Deposit Money");
                System.out.println("4) Exit Menu");
                menuChoice = kb.nextInt();

                //choice equal to 1
                if(menuChoice == 1){
                    System.out.println("The current balance is: " + account[id].getBalance());
                    //continue to next iteration
                    continue;
                }else if(menuChoice == 2){
                    System.out.println("How much would you like to withdraw: ");
                    withDrawalAmount = kb.nextDouble();
                    account[id].withDraw(withDrawalAmount);
                    //continue to next iteration
                    continue;
                }else if(menuChoice == 3){
                    System.out.println("How much would you like to deposit: ");
                    depositAmount = kb.nextDouble();
                    account[id].deposit(depositAmount);
                    //continue to next iteration
                    continue;
                }

                //breaks out of current and "System starts, it will not stop
                exit = false;
                while (!exit) {
                    if (menuChoice == 4) {
                        //exits first instance and asks for a new id while preserving old content for other ids
                        System.out.print("Enter an ID: ");
                        id = kb.nextInt();
                        exit = true;
                    }
                }



            }
        }

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

    public Account(int newID){
        dateCreated = new Date();
        id = newID;
        balance = 100;
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

