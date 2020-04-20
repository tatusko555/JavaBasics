package com.syntax.class30;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
public class Task {
	public static void main(String[] args) {
		Map<String, String> countries = new TreeMap<>();
		countries.put("USA", "Washington DC");
		countries.put("Poland", "Warsaw");
		countries.put("Ukraine", "Kyiv");
		countries.put("Austria", "Vien");
		countries.put("Italy", "Rome");
		countries.put("Bulgaria", "Sofia");
		countries.put("Greece", "Athens");
		Set<String> keys = countries.keySet();
		Collection<String> values = countries.values();
		// keys for loop
		System.out.println("for loop");
		System.out.println("");
		for (String i : countries.keySet()) {
			System.out.println("Countries are :" + i);
		}
		// keys iterator
		System.out.println("Iterator");
		System.out.println("");
		Iterator<String> it = countries.keySet().iterator();
		while (it.hasNext()) {
			System.out.println("Country:" + it.next());
		}
		// values for loop
		System.out.println("for loop");
		System.out.println("");
		for (String i : countries.values()) {
			System.out.println("Capital City :" + i);
		}
		// values iterator
		System.out.println("Iterator");
		System.out.println("");
		Iterator<String> it2 = countries.values().iterator();
		while (it2.hasNext()) {
			System.out.println("Capital City:" + it2.next());
		}
	}
}