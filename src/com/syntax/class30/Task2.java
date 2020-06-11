package com.syntax.class30;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Task2 {
	public static void main(String[] args) {

		Map<Integer, String> best = new TreeMap(); 
		best.put(123, "Printer");
		best.put(345, "Tablet");
		best.put(178, "Phone");
		best.put(194, "TV");
		best.put(138, "Sound");
		System.out.println(best);
		
		Set<Entry<Integer, String>> buy = best.entrySet();
		System.out.println(buy);

		Iterator<Entry<Integer, String>> it = buy.iterator();
		while (it.hasNext()) {
			Entry<Integer, String> e = it.next();
			String keyval = e.getKey() + ":::" + e.getValue();
			System.out.println(keyval);

		}
	}
}