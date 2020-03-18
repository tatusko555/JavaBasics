package com.syntax.class02;

public class Task5 {

	public static void main(String[] args) {
		String name, lastName, city, state;
		char grade = 'B';
		long phoneNumber = 1234567890l;
		name = "Andrii";
		lastName = "Tatusko";
		city = "Brooklyn";
		state = "NY";
		System.out.println(name);
		System.out.println(lastName);
		System.out.println(grade);
		System.out.println(city);
		System.out.println(state);
		System.out.println(phoneNumber);
		System.out.println("My name is " + name + " and my last name is " + lastName + ".");
		System.out.println(
				"I live in city of " + city + " in state " + state + " and my phone number is " + phoneNumber + "!");
		city = "Denver";
		state = "Colorado";
		phoneNumber = 1243456789l;
		grade = 'A';
		System.out.println(city);
		System.out.println(state);
		System.out.println(phoneNumber);
		System.out.println(grade);

	}
}
