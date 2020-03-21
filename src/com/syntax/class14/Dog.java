package com.syntax.class14;

public class Dog {

	String breed;
	String color;
	String name;
	int age;
	public static void main(String[] args) {
		// create bike object
		// new Bike;-->cannot create an object if we don't have a class

		Dog dog1 = new Dog();
		dog1.breed = "Bulldog";
		dog1.color = "Gold";
		dog1.name = "Guffy";
		dog1.age = 1;

		Dog dog2 = new Dog();
		dog2.breed = "Akbash";
		dog2.color = "White";
		dog2.name = "Boss";
		dog2.age = 3;
		
		dog1.eat();
		dog1.bark();
		dog1.run();
		System.out.println();
		dog2.eat();
		dog2.bark();
		dog2.run();
	}
	
	void eat() {
		System.out.println(breed+" "+name+" can eat");
	}
	void bark() {
		System.out.println(breed+" "+name+" can bark");
	}
	void run() {
		System.out.println(breed+" "+name+" can run");
	}

}

