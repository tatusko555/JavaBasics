package com.syntax.class12;

public class StringManipulations {

	public static void main(String[] args) {

		String str = "Good Morning Students!";
		
		char letter1 = str.charAt(0);
		System.out.println(letter1);
		
		char letter5 = str.charAt(4);
		System.out.println("Letter at index 4 is "+letter5);
		
		//get all characters 1 by 1 from a String
		char letters;
		for(int i=0; i<str.length(); i++) {
			System.out.print(str.charAt(i)+" ");
		}
		System.out.println();
		System.out.println("-----------------indexOf() FUNCTION------------------");
		
		String name = "Syntax Technologies";
		int index = name.indexOf("y");
		System.out.println(index);
		
		index = name.indexOf(" ");
		System.out.println(index);
		
		index = name.indexOf("Syntax");// Need to use ONLY 1 character(prints first character)
		System.out.println(index);
		
		
				
		
		
	}
}
