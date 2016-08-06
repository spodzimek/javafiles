
package lab2;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.FileReader;
import java.util.Scanner;


public class Lab2 {

    public static void main(String[] args) throws IOException {
        Scanner cinput = (new Scanner(System.in));
        String fileName =("");
        String fileLine =("");
        
        
           
            try{
               
               System.out.print("Enter filename to read from:");
               fileName = (cinput.nextLine());
               
               File file = ( new File(C:\Users\Student\Creative Cloud Files\Desktop\SD2650));
               
               
            if(!file.exists()){
                   
                   throw new IOException("File does not");
               }
               FileReader fr =(new FileReader(file.toString()));
               BufferedReader br = ( new BufferedReader(fr));
               
               
               while((fileLine = (br.readLine())) != (null)){
                   
              
               
               System.out.println(fileLine);
           }
               br.close();
               }
           catch(IOException e){
               System.err.println("Exception:" + e.getMessage());
               e.printStackTrace();
           }
      
    }
    
}
