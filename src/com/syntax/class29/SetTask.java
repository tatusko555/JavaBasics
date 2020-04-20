package com.syntax.class29;

import java.util.Iterator;
import java.util.TreeSet;

public class SetTask {

	public static void main(String[] args) {
//
//		Create a Set collection in which you need to add names of the countries.
//		In this set we want all objects to be sorted in alphabetical order.
//		Using 2 different ways retrieve all elements from set.
		
		TreeSet<String> countries = new TreeSet<>();
		countries.add("Ukraine");
		countries.add("Thailand");
		countries.add("USA");
		countries.add("Spain");
		
		System.out.println(countries);
		
		Iterator<String> it = countries.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("----------using for each loop-------");
		for(String country:countries) {
			System.out.println(country);
		}
		
	}

}
