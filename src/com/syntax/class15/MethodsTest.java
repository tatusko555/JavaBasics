package com.syntax.class15;

public class MethodsTest {

	public static void main(String[] args) {

		Methods obj = new Methods();
		obj.sayWelcome();
		
		System.out.println("---------------");
		obj.sayAnything("Hello", 2);
		obj.sayAnything("Bye", 3);
		
		System.out.println("---------------");
		obj.isItRaining(true);
		obj.isItRaining(false);
	}

}
