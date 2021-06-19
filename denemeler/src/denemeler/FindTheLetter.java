package denemeler;

import java.util.Scanner;

public class FindTheLetter {
	public void findLetter() {
        Scanner scan = new Scanner(System.in);
        int counter = 0;
        
        System.out.print("Enter a sentence or a word : ");
        String sentence = scan.nextLine();
 
        for(int i = 0; i < sentence.length(); i++)
        {
            if(sentence.charAt(i) == 'a' || sentence.charAt(i) == 'A') {
            	counter++;
            }
        }
        System.out.println("There are " + counter + " 'a' letters in the sentence or word.");
	}

}
