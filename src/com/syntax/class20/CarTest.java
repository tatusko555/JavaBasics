package com.syntax.class20;

public class CarTest {

	public static void main(String[] args) {

		Car car = new Car();
		
		System.out.println("_______________");
			
		Mercedes merc = new Mercedes();
		merc.display();
		
		
		Mercedes merc1 = new Mercedes("Mercedes","GLE","AMG");
		merc1.display();
	}

}
