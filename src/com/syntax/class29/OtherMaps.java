package com.syntax.class29;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class OtherMaps {

	public static void main(String[] args) {
		// store student id and student name 
		Map<Integer, String> lmap = new LinkedHashMap<>();
		lmap.put(1000, "John Smith");
		lmap.put(1001, "Jane Smith");
		lmap.put(1002, "Faisal Sakhil");
		
		System.out.println(lmap);
		
		//store objects in a form of key and value and to sort keys in Ascending order
		Map<Integer, String> tmap = new TreeMap<>();// Alphabetical
		tmap.put(1000, "John Smith");
		tmap.put(1001, "Jane Smith");
		tmap.put(1002, "Faisal Sakhil");
		tmap.put(102, "Ali Tarlaci");
		
		System.out.println(tmap);
		
	}

}
