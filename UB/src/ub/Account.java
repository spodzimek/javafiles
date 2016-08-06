
package ub;

public class Account {
    int accountNumber;
	String accountType;
	String accountStatus;
	double accountBalance;
public void getAccount(){
            accountNumber = 112121;
            accountType = "saving";
            accountStatus = "valid";
            accountBalance = 100000000.0000;
	}
public Account(String accountType, long accountNumber) {
    this.accountType = accountType;
    this.accountNumber = (int) accountNumber;
}
public String getAccountType() {
        return accountType;
    }
public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

public long getAccountNumber() {
        return accountNumber;
    }
public void displayAccount(){
	System.out.print("Account Number" + accountNumber);
	System.out.print("Account Type" + accountType);
	System.out.print("Account Status" + accountStatus);
	System.out.print("Account Balance" + accountBalance);
		}
}

   