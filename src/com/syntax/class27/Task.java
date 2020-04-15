package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class Task {

	public static void main(String[] args) {
		
//		Create an arraylist of cars and retrieve all the values using 3 different ways.
//
//		Create an arrayList of words. Remove every word that ends with “e”. Use iterator
		
		ArrayList<String> cars = new ArrayList<>();
		cars.add("Tesla");
		cars.add("Audi");
		cars.add("BMW");
		
		System.out.println("==================================");
		for(String car:cars) {
			System.out.println(car);
		}
		System.out.println("==================================");
		for(int i = 0; i<cars.size(); i++) {
			System.out.println(cars.get(i));
		}
		System.out.println("==================================");
		Iterator<String> iter = cars.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println("==================================");
		System.out.println("==================================");
		ArrayList<String> words = new ArrayList<String>();
		words.add("Hello");
		words.add("Java");
		words.add("and World");
		
		Iterator<String> greetings2 = words.iterator();
		while (greetings2.hasNext()) {
			if (greetings2.next().endsWith("o")) {
				greetings2.remove();
			}
		}
		System.out.println(words);
		
		
		
	}

}
