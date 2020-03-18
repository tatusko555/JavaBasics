package com.syntax.class08;

import java.util.Scanner;

public class LoopReview {

	public static void main(String[] args) {

		/*
		 * Ask a user to pay for a candy as long as the entered price is not 2 we need
		 * keep asking for paying ones amount correct --> "Enjoy candy"
		 * 
		 */
		Scanner s;
		double price;

		s = new Scanner(System.in);
		do {
			System.out.println("Please pay for a candy");
			price = s.nextDouble();
		} while (price != 2);

		System.out.println("Enjoy candy");
		
		
		System.out.println("________________________________________");
		
		for (int y = 20; y <= 50; y++) {
			if (y % 2 != 0) {
				System.out.print(y);
				System.out.print(" ");
			}
		}
		
		
		
		
		
		
	}

}
