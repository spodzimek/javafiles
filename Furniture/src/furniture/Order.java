
package furniture;

import java.util.Scanner;

public class Order{
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
            int condition = 1 ;
		do {
                        System.out.println("Enter ordering System ");
			System.out.println("(1) Order Chair ");
			System.out.println("(2) Order Bookshelf  ");
			System.out.println("(3) Exit");
                            condition = sc.nextInt();
		if (condition == 1) {
                        Chair chair1 = new Chair();
                        chair1.order();
                        chair1.display();
			}
			else {
			System.out.println("error");
			}
			
		} while (condition != 3);
	}

}


    