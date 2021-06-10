package denemeler;
import java.util.Scanner;

public class Triangle {
	
	public void TriangleArea() {
		
		int firstEdge, secondEdge, thirdEdge;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter triangle's first edge : ");
		firstEdge = input.nextInt();
		
		System.out.println("Please enter triangle's second edge : ");
		secondEdge = input.nextInt();
		
		System.out.println("Please enter triangle's third edge : ");
		thirdEdge = input.nextInt();
		
		
		double length = ((firstEdge+secondEdge+thirdEdge)/2);
		double area = length*(length-firstEdge)*(length-secondEdge)*(length-thirdEdge);
		
		System.out.println("Triangle's area is : " +area);
	}

}
