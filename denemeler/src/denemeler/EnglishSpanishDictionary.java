package denemeler;

import java.util.HashMap;
import java.util.Map;

public class EnglishSpanishDictionary {
	
	public void dictionary() {
		
		Map<String,String> dictionary = new HashMap<String, String>();
		
		dictionary.put("Monday", "Lunes");
		dictionary.put("Tuesday", "Martes");
		dictionary.put("Wednesday", "Miercoles");
		dictionary.put("Thursday", "Jueves");
		dictionary.put("Friday", "Viernes");
		dictionary.put("Saturday", "Sabado");
		dictionary.put("Sunday", "Domingo");
		
		System.out.println(dictionary.get("Monday"));
		System.out.println(dictionary.get("Tuesday"));
		System.out.println(dictionary.get("Wednesday"));
		System.out.println(dictionary.get("Thursday"));
		System.out.println(dictionary.get("Friday"));
		System.out.println(dictionary.get("Saturday"));
		System.out.println(dictionary.get("Sunday"));
		
		System.out.println("\n"+dictionary.keySet());
		System.out.println(dictionary.values());
		System.out.println("\nThe sie of our dictionary is : "+dictionary.size());
		
	}

}
