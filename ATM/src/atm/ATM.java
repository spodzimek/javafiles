
package atm;

import java.util.Scanner;


public class ATM { private String zip; public void validateZipCode() {
    
Scanner console = new Scanner(System.in); 
    int ctr = 1; 
        boolean error = false; 
    do{ 
            System.out.print("Enter Zip Code: "); 
        zip = console.nextLine(); 
    if (ctr == 3) { 
            System.out.println("Your account is blocked"); 
break; } 
    else if (zip.length() < 4 || zip.length() > 4) { 
            error = true; ctr++; } 
    else if (zip.equals("4351")) { 
            System.out.println("Zip Code is correct"); break; } 
    else{ 
            System.out.println("Zip Code is not correct"); 
                error = true; ctr++; } 
}
    while(error); } 
public static void main(String[] args) { 
        ATM atm = new ATM(); 
            atm.validateZipCode(); } 
} 

