package com.syntax.class23;

//Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell. 
//
//Define common behavior within and some fields in parent class and override some of the methods in child classes
//Define some methods specific to child classes
//Create objects of child classes and store them into array. Loop through each object and execute available methods.

public class Computer {
	String brand;
	
	public Computer(String brand) {
		this.brand = brand;
	}
	public void hasOS() {
		System.out.println("Computer has operation system");
	}
	

}
class Apple extends Computer{
	public Apple(String brand) {
		super(brand);
	}
	public void hasOS() {
		System.out.println("Computer has iOS operation system");
	}
}
class Lenovo extends Computer{
	public Lenovo(String brand) {
		super(brand);
	}

	public void hasOS() {
		System.out.println(brand+" has Windows operation system");
	}
}
class HP extends Computer{
	public HP(String brand) {
		super(brand);
	}

	public void hasOS() {
		System.out.println(brand+" has operation system");
	}
	
}
class Dell extends Computer{
	public Dell(String brand) {
		super(brand);
	}

	public void hasOS() {
		System.out.println(brand+" has operation system");
	}
}
