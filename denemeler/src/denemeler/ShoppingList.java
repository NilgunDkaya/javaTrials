package denemeler;

import java.util.HashMap;
import java.util.Map;

public class ShoppingList {
	
	public void shoppingList() {
		
		Map<String,Boolean> shoppingList = new HashMap<String, Boolean>();
		
		shoppingList.put("Ham", true);
		shoppingList.put("Bread", Boolean.TRUE);
		shoppingList.put("Oreos", Boolean.TRUE);
		shoppingList.put("Eggs", Boolean.FALSE);
		shoppingList.put("Sugar", false);
		
		System.out.println(shoppingList.get("Ham"));
		System.out.println(shoppingList.get("Oreos"));
		
		System.out.println(shoppingList.toString());
		System.out.println(shoppingList.isEmpty());
		
		shoppingList.remove("Eggs");
		shoppingList.replace("Bread", Boolean.FALSE);
		
		System.out.println(shoppingList.toString());
		
		shoppingList.clear();
		
		System.out.println(shoppingList.toString());
		System.out.println(shoppingList.isEmpty());
	}

}
