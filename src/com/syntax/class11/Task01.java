package com.syntax.class11;

public class Task01 {

	public static void main(String[] args) {

//		Create an array of cars : american, german, korean, italian. 
//		Then retrieve all values from that array using 2 different loops
		
		String[][] cars = {
				{"Dodge","Jeep","Lincoln","Chevrolet"},
				{"BMW","Mercedes","WV"},
				{"Kia"},
				{"Fiat","Ferarri"}
		};
		int counter =0;
		for(String[] make:cars) {
			for(String model:make) {
			System.out.print(model+" ");
			}
			System.out.println();
		}
		System.out.println("Another way------------------------>");
		
		for(int i=0; i<cars.length;i++) {
			for(int j =0; j<cars[i].length; j++) {
				System.out.print(cars[i][j]+" ");
				counter++;
			}
			System.out.println();
			
		}
		System.out.println(counter);
		
		
		
		
		
	}
}
