package denemeler;
import java.util.Scanner;

public class PassTheClass {
	
	public void passedOrFailed() {
		
		int mathematics, physics, turkish, chemistry, music;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter your mathematics grade : ");
		mathematics = input.nextInt();
		
		System.out.print("Please enter your physics grade : ");
		physics = input.nextInt();
		
		System.out.print("Please enter your turkish grade : ");;
		turkish = input.nextInt();
		
		System.out.print("Please enter your chemistry grade : ");
		chemistry = input.nextInt();
		
		System.out.print("Please enter your music grade : ");
		music = input.nextInt();
		
		mathematics = (mathematics >= 0 && mathematics <= 100) ? mathematics : 0;
		physics = (physics >= 0 && physics <= 100) ? physics : 0;
		turkish = (turkish >= 0 && turkish <= 100) ? turkish : 0;
		chemistry = (chemistry >= 0 && chemistry <= 100) ? chemistry : 0;
		music = (music >= 0 && music <= 100) ? music : 0;
		
		double average = (mathematics + physics + turkish + chemistry + music)/5;
		
		if(average<55)
			System.out.println("You failed the class. See you again next year.");
		else
			System.out.println("Congratulations! You passed the class.");
		
		System.out.println("Your average is : " +average);
		
		
	}

}
