package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListAndIterator {

	public static void main(String[] args) {
		// lets create an ArrayList to store Chocolate

		ArrayList<String> choco = new ArrayList<>();
		choco.add("kinder");
		choco.add("godiva");
		choco.add("kit kat");
		choco.add("snikers");

		// create arrayList of sweets

		ArrayList<String> sweets = new ArrayList<>();
		sweets.add("ice cream");
		sweets.add("cheese cake");
		sweets.addAll(choco);

		System.out.println(sweets.size());
		System.out.println(sweets);

		System.out.println("==================================");

		// we want to iterate through the collection
		Iterator<String> it = sweets.iterator();
		
		if(it.hasNext()) {// <----------printing one (first) element
			String element = it.next();
			System.out.println(element);
			
			while(it.hasNext()) {
				String element1 = it.next();
			element1.equals("ice cream") ;
				it.remove();
			
			}
			System.out.println("Array List after removing element");
			System.out.println(sweets);
			
		}
		System.out.println("==================================");
		while(it.hasNext()) {
			String element = it.next();
			System.out.println(element);
		}
		System.out.println("==================================");
		//printing elements backwards
		for(int i = sweets.size()-1; i>=0; i--) {
			System.out.println(sweets.get(i)+";");
		}
		
		System.out.println("==================================");
		
	}

}
