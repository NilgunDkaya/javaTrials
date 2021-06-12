package denemeler;
import java.util.Scanner;

public class GroceryShopping {
	
	public void calculateAmount() {
		
		int pear, apple, tomato, banana, eggplant;
		double totalPrice;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many kilos of pears did you buy : ");
		pear = input.nextInt();
		
		System.out.println("How many kilos of apples did you buy : ");
		apple = input.nextInt();
		
		System.out.println("How many kilos of tomatoes did you buy : ");
		tomato = input.nextInt();
		
		System.out.println("How many kilos of bananas did you buy : ");
		banana = input.nextInt();
		
		System.out.println("How many kilos of eggplants did you buy : ");
		eggplant = input.nextInt();
		
		totalPrice = (pear*2.14) + (apple*3.67) + (tomato*1.11) + (banana*0.95) + (eggplant*5.0);
		
		System.out.println("Total price of grocery shopping is : " +totalPrice + " TL");
	}

}
