package com.syntax.class10;

public class RetrieveElements {

	public static void main(String[] args) {

		char[] grades = {'A','B','C','D','E','F'};
		//getting all elements
		
		for(int i=0;i<grades.length; i++) {
			System.out.print(grades[i]+" ");
		}
		System.out.println();
		System.out.println("&&&&&&&&&&&&&Printing using advanced for loop&&&&&&&&&&&");
		
		for(char grade:grades) {
			
			System.out.print(grade+" ");
		}
		
		System.out.println("<<<<<<<<<<<<>>>>>>>>>>>>>><<<<<<<<<<<>>>>>>>>>>>>");
		
		String[] fruits = {"Banana","Kiwi","Apple","Mango"};
		
		//advanced for loop, enhanced for loop, for each loop
		
		for(String fruit:fruits) {
			System.out.println(fruit);
		}
		System.out.println("<<<<<<<<<<<<>>>>>>>>>>>>>><<<<<<<<<<<>>>>>>>>>>>>");

		for(int i=0; i<fruits.length; i++) {
			System.out.println(fruits[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
