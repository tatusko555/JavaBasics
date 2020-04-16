package com.syntax.class27;

import java.util.ArrayList;

public class HomeWork3 {

	public static void main(String[] args) {
		//3. Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.
		
		ArrayList<String> drinks = new ArrayList<String>();
		drinks.add("water");
		drinks.add("Coke");
		drinks.add("Juice");
		drinks.add("Seltzer");
		
		for(int i = 0; i<drinks.size(); i++) {
			if(drinks.get(i).contains("a") || drinks.get(i).contains("e")) {
				drinks.set(i, "Water");
			}
		}
		System.out.println(drinks);
	}

}
