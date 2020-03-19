package com.syntax.class13;

public class Q1 {

	public static void main(String[] args) {

		//Write a program to swap 2 numbers without a temporary variable? 
		//Swap  2 strings without a temporary variable?

		int a = 10;
		int b = 20;
		
		a = a+b; // 30
		b = a-b; // 30-20=10
		a = a-b;
		
		System.out.println("The value of a = "+a);
		System.out.println("The value of b = "+b);
		
		
		String str1 = "Day";
		String str2 = "Night";
		
		str1 = str1.concat(str2); // DayNight
		str2 = str1.substring(0, str1.length()-str2.length()); // Day
		str1 = str1.substring(str2.length()); // Night
		
		System.out.println("The value of str1 = "+str1);
		System.out.println("The value of str2 = "+str2);
		
		
		// Another way
		
		String str3 = "Hello";
		String str4 = "Bye";
		
		str3 = str3+str4;
		str4 = str3.replace(str4, "");
		str3 = str3.replace(str4, "");
		
		System.out.println("The value of str1 = "+str3);
		System.out.println("The value of str2 = "+str4);
		
		
		
		
		
		
		
		
	}
}
