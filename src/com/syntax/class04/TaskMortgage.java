package com.syntax.class04;

public class TaskMortgage {

	public static void main(String[] args) {

		double mortgageRate = 4.2;
		int mortgagePrice = 250000;

		if (mortgageRate < 4.5) {
			System.out.println("You can buy a house");
			if (mortgagePrice > 200000) {
				System.out.println("You will need to take a loan");
			} else {
				System.out.println("You can pay cash");
			}
		} else {
			System.out.println("You will not buy a house");
		}

	}

}
