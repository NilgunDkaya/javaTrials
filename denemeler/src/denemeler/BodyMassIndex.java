package denemeler;
import java.util.Scanner;

public class BodyMassIndex {
	
	public void calculateBodyMassIndex() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your height in meters : ");
		double height = input.nextDouble();
		
		System.out.println("Please enter your weight : ");
		double weight = input.nextDouble();
		
		double bodyMassIndex = weight/(height*height);
		
		System.out.println("Your body mass index is : " +bodyMassIndex);
		
	}

}
