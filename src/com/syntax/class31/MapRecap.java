package com.syntax.class31;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapRecap {

	public static void main(String[] args) {
		
		//lets create a hashmap of countries with capitals
		
		Map<String, String> hmap = new HashMap<>();
		hmap.put("USA", "Washington DC");
		hmap.put("Ukraine", "Kyiv");
		hmap.put("France", "Paris");
		hmap.put("Italy", null);
		hmap.put(null, "some value");
		System.out.println(hmap);
		
		//how to get all the keys from a map? keySet(), entrySet()
		Set<String> keys = hmap.keySet();//use loop or iterator
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("-=====-Keys using entry set-=====-");
		Set<Entry<String, String>> entries = hmap.entrySet();
		Iterator<Entry<String, String>> iter = entries.iterator();
		//lets get both key and value
		while(iter.hasNext()) {
			Entry<String, String> entry = iter.next();
			String myEntry = entry.getKey()+" "+entry.getValue();
			System.out.println(myEntry);
		}
		
		//how to get all the values from a map? values(), entrySet()
		System.out.println("-=====-values using .values()-=====-");
		Collection<String> values = hmap.values();//use loop or iterator
		it = values.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
		//lets create a hashtable of countries with capitals
		
		Map<String, String> htable = new Hashtable<>();
		htable.put("USA", "Washington DC");
		htable.put("Ukraine", "Kyiv");
		htable.put("France", "Paris");
		//htable.put("Italy", null);--> we cannot store null values inside hashtable
		//htable.put(null, "some value");--> we cannot store null keys inside hashtable
		System.out.println(htable);
		
		//first part of the code
		createMap("City", "Chantilly");
		
		//second part of the code
		createMap("City", "WashingtonDC");
		
	}
	public static Map<String, String> createMap(String key, String value) {
		Map map = new HashMap<>();
		map.put(key, value);
		return map;
	}

}
