
package universalbank2;

public class Customer {
      int customerID;
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
}
    


