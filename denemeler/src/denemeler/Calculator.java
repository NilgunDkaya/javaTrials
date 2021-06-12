package denemeler;
import java.util.Scanner;

public class Calculator {
	
	public void calculate() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first number for calculation : ");
		int first = input.nextInt();
		
		System.out.print("Enter second number for calculation : ");
		int second = input.nextInt();
		
		System.out.println("First number : " +first + " Second number : " +second);
		
		System.out.println("Enter an option for calculation");
		System.out.println("1 - Addition\n2 - Subtraction\n3 - Multiplication\n4 - Division");
		
		int selection = input.nextInt();
		
		switch(selection){
			case 1:
				System.out.println("" +first +" + " +second +" = " +(first+second));
				break;
			case 2:
				System.out.println("" +first +" - " +second +" = " +(first-second));
				break;
			case 3:
				System.out.println("" +first +" * " +second +" = " +(first*second));
				break;
			case 4:
				System.out.println("" +first +" / " +second +" = " +(first/second));
				break;
			default:
				System.out.println("Please enter a valid option!");
		}
		
	}

}
