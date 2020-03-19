package com.syntax.class13;

public class Q3 {

	public static void main(String[] args) {

		/*
		 * Write a Java Program to print first 10 numbers of Fibonacci series.
		 * 0 1 1 2 3 5 8 13 21 34 ...
		 */
		
		int a, b, c;
		a=0;
		b=1;
		
		for(int i=1; i<10; i++) {
			
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
			
		}
		
		
		
		
	}
}
