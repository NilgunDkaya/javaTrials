package denemeler;
import java.util.Scanner;

public class TaxiMeter {
	
	public void calculatePrice() {
		
		double startPrice = 10.0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter how many kilometers you will travel : ");
		
		int totalKilometer=input.nextInt();
		
		double totalKmPrice = (totalKilometer*2.20)+startPrice;
		
		totalKmPrice = (totalKmPrice < 20.0) ? 20.0 : totalKmPrice;
		
		System.out.println("You have to pay for this travel : " +totalKmPrice + " TL" );
		
		
//		if(startPrice+kmPrice < 20.0)
//		{
//			System.out.println("You have to pay for this travel : 20 TL ");
//		}
//		else
//			System.out.println("You have to pay for this travel : " +(startPrice+kmPrice) + " TL" );
		
	}

}
