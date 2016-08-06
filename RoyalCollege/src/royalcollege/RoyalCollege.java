package royalcollege;

import java.util.Scanner;

public class RoyalCollege {
        public static void main(String[] args) {
            String registrationNumber;
            String departmentName;
            String permanentAddress;
            String emailID;
            String phoneNumber;
            String isRegister;
            
            Scanner scanner=new Scanner(System.in);
            System.out.print("Enter the Registration Number");
            registrationNumber=scanner.nextLine();
            System.out.print("Enter the Department Name");
            departmentName=scanner.nextLine();
            System.out.print("Enter the Permanent Address");
            permanentAddress=scanner.nextLine();
            System.out.print("Enter the Email ID");
            emailID=scanner.nextLine();
            System.out.print("Enter the Phone Number");
            phoneNumber=scanner.nextLine();
            System.out.print("Enter is Register ");
            isRegister=scanner.nextLine();
            scanner.close();
                    
            
            
        
    }
    
}
