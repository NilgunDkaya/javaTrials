package denemeler;

import java.awt.Point;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapTrial {
	public void trialOfMap() {
	    Map<Object,String> map = new HashMap<Object,String>();
	    map.put(26091801,"kullanici");
	    map.put(new Point(17,34),"kullanici2");
	    map.put("key value","kullanici3");
	    map.put(null,"kullanici4");
	    map.put(false,"kullanici5");
	    map.put(new Object().hashCode(),"kullanici6");
	    
	    //////////////
	    Set set = map.keySet(); //key(anahtar) değerleri
	    Iterator it = set.iterator();

	    while(it.hasNext()){
	    Object deger = map.get(it.next());
	    System.out.println(deger.toString());
	    }
	    
	    //////////////
	    Set degerler = map.entrySet(); //her bir key değerin temsil ettiği değerler
	    System.out.println("\nentrySet"+degerler);
	    
	    //////////////
	    if(map.containsKey(new Point(17,34))){
	    	System.out.println("\naranan anahtarın tuttuğu değer -> "+map.get(new Point(17,34)));
	    }
	    
	    //////////////
	    System.out.println("\nanahtar değeri 26091801 olan kaldırılan değer : "+map.remove(26091801));
	    
	    //////////////
	    System.out.println("\nreplace() ile değer değiştirme: "+map.replace(new Point(17,34), "user"));
	    System.out.println(map);
	    
	    //////////////
	    map.clear();
	    System.out.println(map);
	    
	    //////////////
	    TreeMap<Integer,String> tree = new TreeMap<Integer,String>();
	    tree.put(123, "veri 2");
	    tree.put(999, "veri 5");
	    tree.put(888, "veri 4");
	    tree.put(8, "veri 1");
	    tree.put(777, "veri 3");
	    System.out.println("\n"+tree);
	    
	    //////////////
	    System.out.println("\nlistenin en başında ki veri: " +tree.firstKey());
	    System.out.println("listenin en sonunda ki veri: " +tree.lastEntry());

	}

}
