package denemeler;

import java.util.Scanner;

public class VowelsInAWord {
	
	public void findVowels() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a word : ");
		String word = scan.nextLine();
		
		int vowels = 0;
		
		for (int i = 0; i < word.length(); i++) {
			if(	word.charAt(i) == 'a' || word.charAt(i) == 'A' ||
				word.charAt(i) == 'e' || word.charAt(i) == 'E' ||
				word.charAt(i) == 'ý' || word.charAt(i) == 'I' ||
				word.charAt(i) == 'i' || word.charAt(i) == 'Ý' ||
				word.charAt(i) == 'o' || word.charAt(i) == 'O' ||
				word.charAt(i) == 'ö' || word.charAt(i) == 'Ö' ||
				word.charAt(i) == 'u' || word.charAt(i) == 'U' ||
				word.charAt(i) == 'ü' || word.charAt(i) == 'Ü')
				
				vowels ++;
		}
		
		System.out.println("The word '" +word + "' has " +vowels +" vowels");
		
	}

}
