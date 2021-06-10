package denemeler;
import java.util.Scanner;

public class NotOrtalamasý {
	
	public void ortalama() {
		
		int mathematics, chemistry, physics, biology, history;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your mathematics score : ");
		mathematics = input.nextInt();
		
		System.out.println("Please enter your chemistry score : ");
		chemistry = input.nextInt();
		
		System.out.println("Please enter your physics score : ");;
		physics = input.nextInt();
		
		System.out.println("Please enter your biology score : ");
		biology = input.nextInt();
		
		System.out.println("Please enter your history score : ");
		history = input.nextInt();
		
		int sum = mathematics + chemistry + physics + biology + history;
		double result = sum/6;
		
		System.out.println("Your score average is : " +result);
	}

}
