package com.syntax.class09;

public class ArraysAnotherWay {

	public static void main(String[] args) {

		// create an array and store name of our classes

		String[] syntaxClasses = { "SDLC", "Manual Testing", "Java", "GIT" };

		System.out.println("Today we are learning " + syntaxClasses[2] + " class");

		// ---------------------------------

		System.out.println("_________Creating array of cities__________");

		String[] cities = { "Washington DC", "Brooklyn", "Paris", "Milan","Dallas","Miami" };

		System.out.println("I live in " + cities[2]);
		
		int arraySize = cities.length;//6 elements
		System.out.println("Total elements "+arraySize);
		System.out.println(cities[arraySize-1]);//prints the last element
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		//access all elements from array
		for(int i=0; i<arraySize; i++) {
			System.out.println(cities[i]);
		}

	}

}
