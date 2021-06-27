package denemeler;

import java.util.Scanner;

public class BinaryToDecimal {
	
	public void convert() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter binary number for converting to decimal  : ");
		String binary = scan.nextLine();
		
		int[] numbers = new int[binary.length()];
		
		int decimal =0;
		Boolean control = true;
		
		for (int i = 0; i < binary.length(); i++) {
			if (!(binary.charAt(i) == '0' || binary.charAt(i) == '1')) {
				System.out.println("Wrong typing");
				control = false;
				break;
			}
				
			numbers[i] = binary.charAt(i) - '0';
		}
		
		if(control) {
			for (int i = 0; i < binary.length(); i++)
				decimal += Math.pow(2, binary.length()-1-i) * numbers[i];
			
			System.out.println(binary + " ikilik sayý : " +decimal);
		}
		
	}

}
