package denemeler;
import java.util.Scanner;
import java.lang.Math;

public class Triangle {
	
	public void TriangleArea() {
		
		int firstEdge, secondEdge, thirdEdge;
		double alan;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter triangle's first edge : ");
		firstEdge = input.nextInt();
		
		System.out.println("Please enter triangle's second edge : ");
		secondEdge = input.nextInt();
		
		System.out.println("Please enter triangle's third edge : ");
		thirdEdge = input.nextInt();
		
		
		double length = ((firstEdge+secondEdge+thirdEdge)/2);
		double area = Math.pow((length*(length-firstEdge)*(length-secondEdge)*(length-thirdEdge)), 0.5) ;
		 
		
		System.out.println("Triangle's area is : " +area);
	}

}
