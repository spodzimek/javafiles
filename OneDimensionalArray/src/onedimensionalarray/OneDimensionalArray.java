
package onedimensionalarray;

import java.util.Scanner;


public class OneDimensionalArray {

    public static void main(String[] args) {
        int month_days[];
        month_days = new int[12];
        month_days[0] = 31;
        month_days[0] = 28;
        month_days[0] = 31;
        month_days[0] = 30;
        month_days[0] = 31;
        month_days[0] = 30;
        month_days[0] = 31;
        month_days[0] = 31;
        month_days[0] = 30;
        month_days[0] = 31;
        month_days[0] = 30;
        month_days[0] = 31;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of days in the month");
        int day = scanner.nextInt();
        int count = 0;
        for (int i=0; i<month_days.length; i++){
            if (month_days[i] == day){
                count = count +1;
            }
        }
        
        System.out.println("There are" + count + " months with" + day + "days");
    
}
        
        
    
    
}
