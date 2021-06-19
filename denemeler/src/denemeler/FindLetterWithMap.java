package denemeler;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindLetterWithMap {
	
	public void findLetters() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a sentence to find letter on it : ");
        String sentence = scan.nextLine();
        
        Map<Character, Integer> letterMap = new HashMap<Character, Integer>();
//        Character[] letters = new Character[sentence.length()];
//        
//        for(int i=0; i<sentence.length(); i++) 
//        	letters[i] = sentence.charAt(i);
        
		for(Character letter : sentence.replace(" ", "").toCharArray()) {
			
			Integer integer = letterMap.get(letter);
			
			if(integer == null) {
				letterMap.put(letter, 1);
			}
			else {
				letterMap.put(letter, integer+1);
			}
		}
		
		System.out.println(letterMap);
		
		for (Map.Entry<Character, Integer> entry : letterMap.entrySet()) {
	        System.out.print(entry.getKey() + ":" + entry.getValue() + ", ");
	    }
	}
}
