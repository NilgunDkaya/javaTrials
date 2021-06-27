package denemeler;

import java.util.Scanner;

public class Factorial {
	
	public void findFactorial() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number for calculating factorial : ");
		Integer number = scan.nextInt();
		
		int f=1;
		for (int i = 2; i <= number; i++) {
			f *= i;
		}
		
		System.out.println("Factorial for " +number +" is " +f);
	}

}
