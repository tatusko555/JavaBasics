package com.syntax.class22;

public class CreditCardTest {

	public static void main(String[] args) {

		CreditCard obj = new CreditCard(500);
		double interest = obj.getInterest();
		System.out.println(interest);
		
		Visa obj1 = new Visa(800);
		interest = obj1.getInterest();
		System.out.println(interest);
		
		AX obj2 = new AX(900);
		interest = obj2.getInterest();
		System.out.println(interest);	}

}
