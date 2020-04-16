package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class FoodTest {

	public static void main(String[] args) {

		ArrayList<Food> arrFood = new ArrayList<>();
		arrFood.add(new Salad());
		arrFood.add(new Fruits());
		arrFood.add(new Soup());
		
		for(Food food:arrFood) {
			food.cook();
			food.eat();
			food.taste();
			System.out.println("");
		}
		System.out.println("==================================");
		for(int i=0; i<arrFood.size(); i++) {
			arrFood.get(i).cook();
			arrFood.get(i).eat();
			arrFood.get(i).taste();
			System.out.println();
		}
		System.out.println("==================================");
		Iterator<Food> iter = arrFood.iterator();
		while(iter.hasNext()) {
			Food f = iter.next();
			f.cook();
			f.eat();
			f.taste();
			System.out.println();
		}
		
		
	}

}
