
package universalbank2;

public class Employee {

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
	System.out.print("Employee Email" + employeeEmail);
}
}

   