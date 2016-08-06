package universalbank;

public class Employee extends Branch{
    String eCode; 
    String name;
    String address;
    String phoneNumber;
    String emailAddress;

    public Employee(String branchCode) {
        super(branchCode);
    }

    public Employee() {
    }

    public Employee(String eCode, String name, String address, String phoneNumber, String emailAddress, String branchCode) {
        super(branchCode);
        this.eCode = eCode;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    public Employee(String eCode, String name, String address, String phoneNumber, String emailAddress) {
        this.eCode = eCode;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    public String geteCode() {
        return eCode;
    }

    public void seteCode(String eCode) {
        this.eCode = eCode;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    
    
}




