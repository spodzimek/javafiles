
package furniture;

import java.util.Scanner;

public class Bookshelf extends Furniture{
    private String woodType;
    private String getNumofShelves;
	@Override
	public void order() {
		Scanner ch1 = new Scanner(System.in);
                    System.out.println(".................");
                    System.out.println("Please enter your Bookshelf Order");
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
                System.out.println(".................");
                    System.out.print("Please enter the number of shelves");
                setNumofShelves(ch1.nextInt());
				
		
	}

	@Override
	public void display() {
		System.out.println("Display Chair Values");
		System.out.println("Wood Type : " + woodType);
		System.out.println("Color  : " + getColor());
		System.out.println("height : " + getHeight());
		System.out.println("width :  " + getWidth());
                System.out.println("NumofShelves" + getNumofShelves);
		
	}

    private void setNumofShelves(int nextInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}


    

