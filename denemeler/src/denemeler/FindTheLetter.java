package denemeler;

import java.util.Scanner;

public class FindTheLetter {
	public void findLetter() {
        Scanner scan = new Scanner(System.in);
        int counter = 0;
        
        System.out.print("Enter a sentence or a word : ");
        String sentence = scan.nextLine();
	System.out.print("Enter a letter to find : ");
        char letter = scan.next().charAt(0);
 
        for(int i = 0; i < sentence.length(); i++)
        {
            if(sentence.charAt(i) == Character.toLowerCase(letter) || sentence.charAt(i) == Character.toUpperCase(letter)) {
            	counter++;
            }
        }
        System.out.println("There are " + counter +" " +letter +" letters in the sentence or word.");
	}

}
