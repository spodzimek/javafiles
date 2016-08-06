
package wordscrambler;


import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;


public class WordScrambler{ 
    public static void main(String[] args){
        ArrayList<Integer> usedElements = ( new ArrayList<Integer>());
        ArrayList<String> encryptedWords = (new ArrayList<String>());
        String[] allWords;
        
        Scanner input = (new Scanner(System.in));
        String word = (" ");
        String encryptedWord = ("");
        
        System.out.println("Please enter a word to scramble: ");
        word = input.nextLine();
        
        allWords = word.split(" ");
        
    int randNum = (0);
          
    for(int i = (0); i< allWords.length; ++i){
    
    for(int x = (0); x < allWords[i].length(); ++x){
             
       randNum = (int)Math.floor(Math.random() * allWords[i].length ());
             
    while (usedElements.contains(randNum)){
       randNum = (int)Math.floor(Math.random() * allWords[i].length());
    }
    
        encryptedWord += allWords[i].charAt(randNum);
    
        encryptedWords.add(encryptedWord);
  
         
         System.out.print(allWords[i]+"\n");}
    }
    }
}
    
    

        

   
    
       
      