package grades;

import java.util.Scanner;

public class Grades {
     public static void main(String[] args) {
         
         Scanner input = new Scanner(System.in);
         double percent = (0.0);
         char letterGrade =(' ');
         
         for (int i = (0); i<(25);++i){
             System.out.print("Enter a grade");
             
             percent = (input.nextDouble());
             
             if(percent>=90 && percent<=100){
                 letterGrade = 'A';
             }
             else if (percent>=80 && percent<=90){
                 letterGrade = 'B';
             }
             else if (percent>=70 && percent<=80){
                 letterGrade = 'C';
             }
             else if (percent>=60 && percent<=70){
                 letterGrade = 'D';
             }
             else if (percent>=0 && percent<=60){
                 letterGrade = 'F';
             }
            
             System.out.println("Student Grade is:" + letterGrade);
         }
     }
}

