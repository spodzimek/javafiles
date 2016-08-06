
package ub;

public class UB {

    
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
public UB(String accountType, long accountNumber) {
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

public class Branch {
  int branchCode;
    String branchAddress;
    String branchCountry;
    
    

public void getBranch(){
        branchCode = 1234;
        branchAddress = "1234 S. Denver";
        branchCountry = "USA";
    }

public int getBranchCode() {
        return branchCode;
    }

    
    public void displayBranch(){
        System.out.print("Branch Code" + branchCode);
        System.out.print("Branch Address" + branchAddress);
        System.out.print("Branch Country" + branchCountry);
    }
public class customer {  int customerID;
     String customerName;
     String customerAddress;
     int customerPhone;
     String customerEmail;
     
public void getCustomer() {
	customerID = 19834180;
	customerName = "Shannon Podzimek";
	customerAddress = "16956 Denker Ave";
	customerPhone = 310-329-5760;
	customerEmail = "fishingladyla@aol.com";
		}
public void displayCustomer(){
	System.out.print("Customer ID" + customerID);
	System.out.print("Customer Name" + customerName);
	System.out.print("Customer Address" + customerAddress);
	System.out.print("Customer Phone" + customerPhone);
	System.out.print("Customer Email" + customerEmail);
}
public class employee { 
    int employeeID;
     String employeeName;
     String employeeAddress;
     int employeePhone;
     String employeeEmail;
     
public void getEmployee() {
	employeeID = 19834180;
	employeeName = "Shannon Podzimek";
	employeeAddress = "16956 Denker Ave";
	employeePhone = 310-329-5760;
	employeeEmail = "fishingladyla@aol.com";
		}
public void displayEmployee(){
	System.out.print("Employee ID" + employeeID);
	System.out.print("Employee Name" + employeeName);
	System.out.print("Employee Address" + employeeAddress);
	System.out.print("Employee Phone" + employeePhone);
	System.out.print("Employee Email" + employeeEmail);}
}
}
}}



   
