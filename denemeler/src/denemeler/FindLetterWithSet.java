package denemeler;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FindLetterWithSet {
	
	public void findLetters() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a sentence to find letter on it : ");
        String sentence = scan.nextLine();
        
        Set<Character> letterSet = new HashSet<Character>();
        
        for(int i=0; i<sentence.length(); i++) {
        	letterSet.add(sentence.charAt(i));
        }
        
        System.out.println(letterSet);
	}

}
