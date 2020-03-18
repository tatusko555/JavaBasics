package com.syntax.class12;

public class StringManipulationsMore {

	public static void main(String[] args) {

		System.out.println("---------substring() FUNCTION-------");
		
		String str = "Today is a rainy day";
		
		String partialString = str.substring(6);//start from index 6 until the end of String
		System.out.println(partialString);
		
		 partialString = str.substring(11);
		System.out.println(partialString);
		
		 partialString = str.substring(0, 5);//start from 0 to index 5
		System.out.println(partialString);
		
		 partialString = str.substring(11, 16);
		System.out.println(partialString);
		
		
	}

}
