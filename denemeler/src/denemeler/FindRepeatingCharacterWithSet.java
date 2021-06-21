package denemeler;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class FindRepeatingCharacterWithSet {
	
	public void find() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter a sentence : ");
		String sentence = scan.nextLine().toLowerCase().replace(" ", "");
		
		Set<Character> letters = new HashSet<Character>();
		List list = new ArrayList();
		
		for(int i=0; i<sentence.length(); i++) {
			if(letters.contains(sentence.charAt(i)))
				list.add(sentence.charAt(i));
			else
				letters.add(sentence.charAt(i));
		}
		
		System.out.println(list);
	}

}
