package denemeler;

import java.util.Scanner;

public class NumbersFromStringToIntegerArray {
	
	public void toIntArray() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter comma seperated numbers  : ");
		String s1 = scan.nextLine();
		
		String[] splitted = s1.split(",");
		
		int n = splitted.length;
		
		int[] array = new int[n];
		
		for (int i = 0; i < n; i++) {
			
			array[i] = Integer.valueOf(splitted[i]);
			System.out.println(i+1 +". sayý : " +array[i]);
		}
		
	}

}
