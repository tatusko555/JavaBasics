package com.syntax.class11;

public class StringDemo {

	public static void main(String[] args) {

		String school = "Syntax";

		String str = new String("Hello");

		String str1 = "This is the String fdhjldkfjd";

		// how many characters String has(space counts too)
		System.out.println(school.length());

		int size = str.length();
		System.out.println("String length is " + size);

		System.out.println("-----------------------------------");
		// convert String to lowercase or uppercase

		System.out.println(school.toUpperCase());
		System.out.println(school.toLowerCase());
		
		System.out.println("-----------------------------------");
		//concatinate 2 Strings
		String newString=str+school;
		System.out.println(newString);
		
		String day = "Saturday";
		String date = "14";
		
		String newDate = day.concat(date);//only to attach Strings
		System.out.println(newDate);
		
		System.out.println("-----------------------------------");
		char grade = 'A';
		String str2 = "Student";
		//str2.concat(grade); will give an error
		
		
		System.out.println("-------------isEmpty Function----------------------");
		
		String str3 = "";
		boolean empty = str.isEmpty();		
		System.out.println(empty);
		
		System.out.println("--------------trim() Function---------------------");
		String str4 = "     Welcome to Syntax!   ";
		str4 = str4.trim();
		System.out.println(str4);
		
		
		
		

	}

}
