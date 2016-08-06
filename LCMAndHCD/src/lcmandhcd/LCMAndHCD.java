
package lcmandhcd;

import java.util.Scanner;

public class LCMAndHCD {
    private static int hcd = -1;
    private static int lcm;
    private static int a;
    private static int b;
public static void main(String[] args){
	getNumbers();
            hcd = calculateHCD(a,b);
	calculateLCM();
	display();}
private static void getNumbers(){
    System.out.println("Enter 2 numbers :");
Scanner sc = new Scanner(System.in);
            a = sc.nextInt();
            b = sc.nextInt();
		sc.close();}
private static int calculateHCD(int a, int b){
    if(b == 0){
	return a; } 
            return calculateHCD(b, a%b);}
private static void calculateLCM(){
    if(hcd == -1){
           hcd = calculateHCD(a,b);}
		lcm = (a*b)/hcd;}
private static void display(){
		System.out.println("HCD of the number is " + hcd);
		System.out.println("LCM of the number is " + lcm);
	}
}
