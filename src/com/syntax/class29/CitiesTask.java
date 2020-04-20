package com.syntax.class29;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class CitiesTask {

	public static void main(String[] args) {

//		Create a Set of cities in which you want to make sure that insertion order is maintained. 
//		Using Iterator remove any city that starts with “A”;
		
		
		LinkedHashSet<String> cities = new LinkedHashSet<>();
		cities.add("New York");
		cities.add("Amsterdam");
		cities.add("Madrid");
		cities.add("Kyiv");
		System.out.println(cities);
		
		Iterator<String> it = cities.iterator();
		while(it.hasNext()) {
		String element = it.next();
			if(element.startsWith("A")) {
				it.remove();
			}
		}
		System.out.println(cities);
		
	}

}
