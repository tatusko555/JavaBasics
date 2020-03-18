package com.syntax.class08;

public class MoreLoops {

	public static void main(String[] args) {

		int total = 2;
		
		for (int k=1; k<4;k++) {
			total = total*k;
		}
		System.out.println(total);
		
		
		//write a program to calculate sum of odds and sum of even numbers
		// 1 to 99
		int sumE = 0;
		int sumV = 0;
		for(int i = 1; i<=99;i++) {
			if(i%2==0) {
				 sumE+=i;
			}else {
			sumV +=i;
			} 
		}
		
		System.out.println("Sum of even numbers is "+sumE);
		System.out.println("Sum of odd numbers is "+sumV);
		
		
		
		
		
		
		
	}

}
