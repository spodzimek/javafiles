package banktransactions;

import java.util.Scanner;

    public class BankTransactions {
public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    String num = ("");
    double checkingBalance= 0, savingsBalance =0;
    double amount = (0.0);

    do {
        
            System.out.println("------------------------");
            System.out.println("Select a Transaction by typing number");
            System.out.println("1. Deposit");
            System.out.println("2. Withdrawal");
            System.out.println("3. Balance");
            System.out.println("4. Exit");
            System.out.println("------------------------");
                num = scan.next();
    //if DEPOSIT is selected
    //ask to deposit in checking or savings
        if (num.equals("1")) { 
            System.out.println("------------------------");
            System.out.println("Would you like to deposit in checking or savings?");
            System.out.println("1. Checking");
            System.out.println("2. Savings");
            System.out.println("------------------------");
                num = scan.next();
        if (num.equals("1")) { 
    //if CHECKING is selected
    //enter amount to be deposited
            System.out.println("------------------------");
            System.out.println("Enter amount to deposit in checking account: ");
            System.out.println("------------------------");
                amount = scan.nextDouble();
    // Add the amount to the checking balance
                checkingBalance += amount;
            System.out.println("------------------------");
            System.out.println("Your checking account's balance is " + checkingBalance);
            System.out.println("------------------------");
        }
        else if (num.equals("2")){
    //if SAVINGS is selected
    //enter amount to be deposited
            System.out.println("------------------------");
            System.out.println("Enter amount to deposit in savings account: ");
            System.out.println("------------------------");
                amount = scan.nextDouble();            
    // Add the amount to the savings balance
                savingsBalance += amount;
            System.out.println("------------------------");
            System.out.println("Your savings account's balance is " + savingsBalance);
            System.out.println("------------------------");
        }
    }
    
        else if (num.equals("2")){ 
    //if WITHDRAWAL is selected
    //ask to withdraw from checking or savings 
            System.out.println("------------------------");
            System.out.println("Would you like to withdraw in checking or savings?");
            System.out.println("1. Checking");
            System.out.println("2. Savings");
            System.out.println("------------------------");
                num = scan.next();
        if (num.equals("1")) {
    //if CHECKING is selected
    //enter amount to withdraw
            System.out.println("------------------------");
            System.out.println("Enter amount to withdraw in checking account: ");
            System.out.println("------------------------");
                amount = scan.nextDouble();
    // Subtract the amount from checking balance
                checkingBalance -= amount;
            System.out.println("------------------------");
            System.out.println("Your checking account's balance is " + checkingBalance);
            System.out.println("------------------------");
        if (num.equals("2")){
    //if SAVINGS is selected
    //enter amount to withdraw
            System.out.println("------------------------");
            System.out.println("Enter amount to withdraw in savings account: ");
            System.out.println("------------------------");
                amount = scan.nextDouble();
    // Add the amount to the savings balance
                savingsBalance -= amount;
            System.out.println("------------------------");
            System.out.println("Your savings account's balance is " + savingsBalance);
            System.out.println("------------------------");
        }
    }
} 
        else if (num.equals("3")) { 
    //if BALANCE is selected
    //ask to see balance of checking or savings
            System.out.println("------------------------");
            System.out.println("Your Checking balance is " + checkingBalance);
            System.out.println("Your Savings balance is " + savingsBalance);
            System.out.println("------------------------");
        }
        else if(num.equals("4")){
            System.out.println("------------------------");
            System.out.println("Good Bye!");
            System.out.println("------------------------");
    break;
        }
    }
        while(true);
}
    }


      
        
    
    
    
            

                        




    
