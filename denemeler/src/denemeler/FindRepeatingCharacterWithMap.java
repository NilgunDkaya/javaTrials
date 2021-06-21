package denemeler;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindRepeatingCharacterWithMap {
	
	public void find() {
		
	
	Scanner scan = new Scanner(System.in);
	
	System.out.print("Please enter a sentence : ");
    String sentence = scan.nextLine().toLowerCase();
    
    Map<Character, Integer> letterMap = new HashMap<Character, Integer>();
    
	for(Character letter : sentence.replace(" ", "").toCharArray()) {
		
		Integer integer = letterMap.get(letter);
		
		if(integer == null) {
			letterMap.put(letter, 1);
		}
		else {
			letterMap.put(letter, integer+1);
		}
	}
	
	for (Map.Entry<Character, Integer> entry : letterMap.entrySet()) {
		if(entry.getValue()>1)
			System.out.print(entry.getKey() + ":" + entry.getValue() + " ");
    }
       
	}
}
