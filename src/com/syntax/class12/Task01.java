package com.syntax.class12;

public class Task01 {

	public static void main(String[] args) {

		//Create a String and print it in reverse order (Sunday → yadnuS).
		String day = "Sunday";
		
		for(int i = day.length()-1; i>=0; i--) {
			
			System.out.print(day.charAt(i));
		}
		System.out.println();
		
//		   Create a String and if the String is not empty perform the following: 
//			if the String has an odd number of characters and has 3 or more characters,
//			print the character in the middle of the String.
//		
		
		String str = "Hello World! Hello ";
		
		if(!str.isEmpty()) {
			if(!(str.length()%2==0) && str.length()>=3) {
				System.out.println(str.substring(6, 12));
			}
			
			
		}
		
		
		
		
	}

}
