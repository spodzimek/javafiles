package javaapplication30;


import static java.awt.SystemColor.text;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class JavaApplication30 {

    public static void main(String[] args) throws FileNotFoundException {
        
        Scanner infile = new Scanner( new FileReader( args[0] ) );
        PrintWriter outfile = new PrintWriter( args[1] );

    int pos, start=0;
    char first, last;
    String words = ("");
    String encryptedWord = ("");
    String[] wordlength = words.trim().split(" "); 

    Random generator = new Random();

while (text.length()>0){
int whiteSpace = text.indexOf(" ", start);
if (whiteSpace<0){break;} else{

first = text.charAt(int);
last = text.charAt(whiteSpace-1);

if ((whiteSpace-1)-start <=0)
System.out.print(text.charAt(start)+ " ");
else {
String eachWord = text.substring(start+1 , whiteSpace-1) ;
//this will give me the substring to scramble, need a integer to randomize?

System.out.print(first);
// this is the first character for each word. need the last and scramble the middle

while(eachWord.length()>0){
pos = generator.nextInt(eachWord.length()); //outputs a random value of the size
System.out.print(eachWord.charAt(pos));
// onces i choose that racndom character i need to take it out of the list.
if (pos==0)
eachWord = eachWord.substring(1);
else if (pos == eachWord.length()-1 )
eachWord = eachWord.substring(0,pos);
else
eachWord = eachWord.substring(0,pos) + eachWord.substring(pos+1, eachWord.length());
}
System.out.print(last + " ") ;//this is the last charater of each word!
}
start = whiteSpace+1;

}}

int lastWhiteSpace = text.lastIndexOf(" ");
System.out.print(text.charAt(lastWhiteSpace+1));
String lastWord = text.substring(lastWhiteSpace+2 , text.length()-2);
while (lastWord.length()>0){
int lpos = generator.nextInt(lastWord.length());
System.out.print(lastWord.charAt(lpos));
if (lpos==0)
lastWord = lastWord.substring(1);
else if (lpos==lastWord.length()-1)
lastWord = lastWord.substring(0,lpos);
else
lastWord = lastWord.substring(0,lpos)+lastWord.substring(lpos +1,lastWord.length());
}
System.out.print(text.charAt(text.length()-2)+".");



}
    }
    

