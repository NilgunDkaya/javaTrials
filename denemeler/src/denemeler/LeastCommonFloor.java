package denemeler;

import java.util.Scanner;

public class LeastCommonFloor {
	
	public void findLeastCommonFloor() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two number for calculating least common floor : ");
		Integer s1 = scan.nextInt();
		Integer s2 = scan.nextInt();
		
		int n1 = s1, n2 = s2;
		
		int s= 1;
		while(n1 != 1 && n2 != 1) {
			int divisor = 2;
			for (int i = 0; i <= (n1>n2 ? n1 : n2); i++) {
				if(n1 % divisor == 0 || n2 % divisor == 0) {
					s *= divisor;
					if(n1 % divisor == 0)
						n1 /= divisor;
					if (n2 % divisor == 0)
						n2 /= divisor;
				}
				else
					divisor++;
			}
		}
		System.out.println("The least common floor for " +s1 +" and " +s2 +" is " +s);
	}

}
