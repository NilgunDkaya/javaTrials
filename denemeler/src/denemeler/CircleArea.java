package denemeler;

import java.util.Scanner;

public class CircleArea {
	
	public void findCircleArea() {
		
		double pi = 3.14, areaOfCircle;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a radius for area of circle : ");
		int radius = input.nextInt();
		
		System.out.println("Please enter an angle for area of circle : ");
		int angle = input.nextInt();
		
		areaOfCircle = (pi*radius*radius*angle)/360;
		
		System.out.println("Area of circle is : " +areaOfCircle);
	}

}
