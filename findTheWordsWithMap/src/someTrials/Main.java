package someTrials;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		
		String str = "Vivamus vestibulum justo varius luctus erat nec lacinia dolor Nulla nisl sem dapibus eget lacus id eleifend consectetur arcu "
				+ "Phasellus vestibulum metus quis eleifend efficitur Nulla nisl mi rhoncus eget vestibulum eget, vehicula a leo "
				+ "Nullam condimentum ipsum luctus venenatis felis eleifend semper ligula Etiam efficitur sapien orci sed elementum arcu tristique ut "
				+ "Nulla libero lacus suscipit ut libero et bibendum efficitur lorem Etiam laoreet odio in dui sollicitudin sed volutpat mauris finibus "
				+ "Vivamus dui elit venenatis efficitur leo eu mollis consequat purus Sed consectetur leo a malesuada sagittis "
				+ "Nunc cursus dolor velit at laoreet nunc consequat sed Donec placerat pharetra mi eu dignissim";
		
		Map<String, Integer> hashMap = new HashMap<>();
		
		String[] words = str.split(" ");
		for(String word : words) {
			
			Integer integer = hashMap.get(word);
			
			if(integer == null) {
				hashMap.put(word, 1);
			}
			else {
				hashMap.put(word, integer+1);
			}
		}
		System.out.println(hashMap);
	}

}
