
package main;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
String num1 = ("");
int Wood = 0;
int Cost;
int Color;
String Woodname="";
do {       
           System.out.println("------------------------");
           System.out.println("Select a Purchase by typing number");
           System.out.println("1. Chair(s)");
           System.out.println("2. Bookshelf");
           System.out.println("4. Exit");
           System.out.println("------------------------");
           num1 = scan.next();

           //if CHAIR(s) is selected
  //ask to choose a type of wood

           if (num1.equals("1")) { 
          System.out.println("------------------------");
          System.out.println("Please choose type of wood?");
          System.out.println("1.Pine");
          System.out.println("2.Oak");
          System.out.println("3.Mahogany");
          System.out.println("------------------------");
               num1 = scan.next();
      
          if (num1.equals("1")) { 
  //if CHAIR(s) is selected
  //ask to choose color
  System.out.println("------------------------");
  System.out.println("1.Black");
  System.out.println("2.White");
  System.out.println("3.Natural w/clear stain");
  System.out.println("----------------------");
      }
      else if (num1.equals("2")){ 
  //if BOOKSHELF is selected
  //ask to choose a type of wood
 System.out.println("------------------------");
 System.out.println("Please choose type of wood?");
 System.out.println("1.Pine");
 System.out.println("2.Oak");
 System.out.println("3.Mahogany");
 System.out.println("------------------------");
 num1 = scan.next();
      }
           }
      else if (num1.equals("2")) {
      
//if BOOKSHELF is selected
//ask to choose color
 System.out.println("------------------------");
 System.out.println("1.Black");
 System.out.println("2.White");
 System.out.println("3.Natural w/clear stain");
 System.out.println("----------------------");
      }
            
           while (true) {
               switch (Wood) {
                   case 1:
                       Woodname="Pine";
                       Cost=100;
                       break;
                   case 2:
                       Woodname="Oak";
                       Cost=225;
                       break ;
                   case 3:
                       Woodname="Mahogany";
                       Cost=375;
                       break ;
                   default:
                       break;
               }
           }
} while(  true );
}
}