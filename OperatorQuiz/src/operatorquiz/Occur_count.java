
package operatorquiz;

import java.util.Scanner;
public class Occur_count
{
    public static void main(String[] args) 
    {
        int n = 0, x, count = 0, i = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter  No of elememy in  array:");
        int num = scan.nextInt();
        int arr[] = new int[num];
        System.out.println("Enter all the elements:");
        for(i = 0; i < n; i++)
        {
            arr[i] = scan.nextInt();
        }
        System.out.print("Enter the Integer for the  count number of occurrences:");
        x = scan.nextInt();
        for(i = 0; i < n; i++)
        {
            if(arr[i] == x)
            {
                count++;
            }
          
       
     
        }
        }
       
    private static class count {

        public count() {
        }
    }
  }

