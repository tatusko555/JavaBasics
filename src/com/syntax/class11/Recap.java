package com.syntax.class11;

public class Recap {

	public static void main(String[] args) {

		String[][] groceries= {
				{"Cucumber", "Potato", "Carrot"},
				{"Mango", "Apple", "Banana", "Kiwi"},
				{"Milk", "Cheese", "Yogurt"}
				};
		for(int r=0; r<groceries.length; r++) {
			
			for(int c=0; c<groceries[r].length; c++) {
				System.out.print(groceries[r][c]+" ");
			}
			System.out.println();
		}
		System.out.println("@@@@@@@@@@@@@@--GETTING ELEMENTS USING ADVANCED FOR LOOP--@@@@@@@@@@@@@@@@@@@");
		//loops through all arrays
		for(String[] array:groceries) {
			//loops trough each single array
			for(String items:array) {
				System.out.print(items+" ");
			}
			System.out.println();
		}
	}
}
