package com.syntax.class10;

public class EnhancedForLoop {

	public static void main(String[] args) {
		String[] fruits = { "Banana", "Kiwi", "Apple", "Mango" };
		//if fruit is apple-->that is your favorite fruit
		// advanced for loop, enhanced for loop, for each loop

		for (String fruit : fruits) {
			if(fruit.equals("Apple")) {
				System.out.println(fruit+" is your favorite fruit");
			}else {
			System.out.println(fruit);
			}
		}
		System.out.println("<<<<<<<<<<<<>>>>>>>>>>>>>><<<<<<<<<<<>>>>>>>>>>>>");
		// regular for loop
		for (int i = 0; i < fruits.length; i++) {
			System.out.println(fruits[i]);
			
		}
		
		
		
	}

}
