
package furniture;

import java.util.Scanner;

public class Chair extends Furniture{
    private String woodType;
	@Override
	public void order() {
		Scanner ch1 = new Scanner(System.in);
                    System.out.println(".................");
                    System.out.println("Please enter your Chair Order");
                    System.out.println(".................");
                    System.out.println("Please enter Wood Type");
                    System.out.println(".................");
		woodType = ch1.nextLine();
                System.out.println(".................");
                    System.out.println("Please enter Color");
		setColor(ch1.nextLine());
                System.out.println(".................");
                    System.out.println("Please enter height");
		setHeight(ch1.nextInt());
                System.out.println(".................");
                    System.out.println("Please enter width");
		setWidth(ch1.nextInt());
				
		
	}

	@Override
	public void display() {
		System.out.println("Display Chair Values");
		System.out.println("Wood Type : " + woodType);
		System.out.println("Color  : " + getColor());
		System.out.println("height : " + getHeight());
		System.out.println("width :  " + getWidth());
		
	}

}

    

