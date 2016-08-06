
package smallestandgreatests;

import java.util.Scanner;

public class SmallestAndGreatest {
    public static void main(String[] args){
		takeInputAndFindSmallesAndGreatest();}
    private static void takeInputAndFindSmallesAndGreatest(){
	System.out.println("Enter 20 numbers :");
            Scanner sc = new Scanner(System.in);
		int i = 0;
		int[] arr = new int[20];
	while(i < 20){
		int no = sc.nextInt();
                    arr[i] = no;
                    i++;}
	System.out.println("Greatest value is " + findGreatest(arr));
	System.out.println("Smallest value is " + findSmallest(arr));
                    sc.close();}
	
    private static int findGreatest(int[] arr){
		int max = arr[0];
	for(int i=1;i <arr.length;i++){
            if(arr[i] > max){
                    max = arr[i];}
		}
	return max;}
    private static int findSmallest(int[] arr){
		int min = arr[0];
	for(int i=1;i <arr.length;i++){
            if(arr[i] < min){
                    min = arr[i];}
		}
	return min;}
}


