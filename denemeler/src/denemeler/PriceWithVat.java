package denemeler;
import java.util.Scanner;

public class PriceWithVat {
	
	public void calculatePriceWithVat() {
		
		double price, priceWithVat;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a price for vat calculation : ");
		price = input.nextDouble();
		
		priceWithVat = price + ((price*18)/100);
		
		System.out.println("Your price with vat is : " +priceWithVat);
		
		
	}

}
