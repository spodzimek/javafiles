package universalbank;

public class Customer extends Branch{
     String customerID;
     String name;
     String address;
     long phoneNumber;
     String emailAddress;
     Account account;

    public Customer(String customerID, String name, Account account) {
        this.customerID = customerID;
        this.name = name;
        this.account = account;
    }

    public Customer() {
    }

    public Customer(String customerID, String name, String address, long phoneNumber, String emailAddress, Account account) {
        this.customerID = customerID;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.account = account;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
     
     
}
