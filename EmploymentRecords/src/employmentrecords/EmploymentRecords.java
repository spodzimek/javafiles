
package employmentrecords;

import java.util.Scanner;


public class EmploymentRecords {
    static int nEmployees = 0;
    static String [][] employees = new String[50][6];
    
    /**
    * @param args
     */

public static void main(String[] args) {
    boolean bContinue = true;
       
    while (bContinue){
        System.out.println("1. Enter data");
        System.out.println("2. View data");
        System.out.println("3. Exit");
        
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter your choice");
    int choice = scanner.nextInt();
    
     switch(choice){
            case 1:
                getNewEmployee(nEmployees++);
                break;
            case 2:
                viewData();
                break;
            case 3:
                System.out.println("Have a Good Day");
                bContinue = false;
                break;
            default:
                System.out.println("Not a valid choice");
     }
    }
}

    public static void getNewEmployee(int index){

            Scanner scanner = new Scanner(System.in);
                System.out.println("Please enter the following information for employee data ");
                System.out.print("ID;");
                    employees[index][0]= scanner.next();
                System.out.print("Name : ");
                    employees[index][1]= scanner.next();
                System.out.print("Department : ");
                    employees[index][2]= scanner.next();
                System.out.print("Designation : ");
                    employees[index][3]= scanner.next();
                System.out.print("Marital Status");
                    employees[index][4] = scanner.next().toLowerCase();
            if (employees[index][4].equals("married")){
                System.out.print("Date of marriage");
                    employees[index][5] = scanner.next();
            }else{
                employees[index][5] = "na";
            }
    }
    public static void viewData(){
        System.out.println("Employee details");
            for(int i=0; i<nEmployees; i++){
                
                System.out.println("..........................");
                    for (int j =0; j<6; j++){
                        System.out.println(employees [i][j]);
                    }
            }
                }
            }
                    
                    
            
       
      