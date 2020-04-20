package com.syntax.class29;

import java.util.HashMap;

public class MapIntro {

	public static void main(String[] args) {
		// HashMap does not maintain the order(random)
		HashMap<String,String> hmap = new HashMap<>();
		// to store values into map we use put
		hmap.put("Name", "John");
		hmap.put("Last Name", "Smith");
		hmap.put("Address", "123 Test");
		hmap.put("City", "Chantilly");
		
		//how to check if map has any values
		
		boolean isEmpty = hmap.isEmpty();
		System.out.println("Map is empty = "+isEmpty);
		
		//how many elements is Map
		int size = hmap.size();
		System.out.println("Map size = "+ size);
		
		//can we add more values into map?
		hmap.put("Zip", "12345");
		
		//can we store duplicate keys? NO, previous value will be replaced
		hmap.put("Name", "Jane");
		System.out.println(hmap);
		
		//how to access the value?--> use method .get() and specify the key
		System.out.println(hmap.get("Name"));
		
		//remove the value
		hmap.remove("Address");
		System.out.println(hmap);
		
		//replace values in map
		hmap.replace("Zip", "98765");
		System.out.println(hmap);
		
		
		
	}

}
