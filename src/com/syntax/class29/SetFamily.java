package com.syntax.class29;

import java.util.*;

public class SetFamily {

	public static void main(String[] args) {
		//hashSet does not guarantee insertion order
		Set<String> veggies = new HashSet<>();
		veggies.add("carrot");
		veggies.add("potato");
		veggies.add("cucumber");
		veggies.add("eggplant");
		veggies.add("cucumber");// no duplicate
		
		System.out.println(veggies);
		
		//LinkedHashSet guarantee insertion order
		Set<String> fruits = new LinkedHashSet<>();
		fruits.add("apple");
		fruits.add("mango");
		fruits.add("kiwi");
		fruits.add("tomato");
		fruits.add("banana");
		fruits.add("mango");
		fruits.add("tomato");
		System.out.println(fruits);
		
		//treeSet stores objects in ascending order
		Set<String> food = new TreeSet<>(veggies);
		food.addAll(fruits);
		System.out.println(food);
		
	}

}
