package universalbank;

public class Account {
    String accountType;
    long accountNumber;

    public Account(String accountType, long accountNumber) {
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
