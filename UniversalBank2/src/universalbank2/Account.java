
package universalbank2;

public class Account {
    String accountType;
    long accountNumber;

    public void Account(String accountType, long accountNumber) {
        this.accountType = accountType;
        this.accountNumber = accountNumber;
    }

    public Account() {
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

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }
    
    
}


