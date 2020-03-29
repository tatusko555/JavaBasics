package com.syntax.class17;

public class Employee {
	
	//create variables to hold: name, last name, title, SSN, salary;
	public static String title;
	public String name;//accessible everywhere
	protected String lastName;//accessible within same package(class17)
	double salary;//accessible within same package(class17)
	private long ssn;//accessible only within same class
	
	public static void method1() {
		System.out.println("I am a public method");
	}
	protected void method2() {
		System.out.println("I am a protected method");
	}
	void method3() {
		System.out.println("I am a default method");
	}
	private void method4() {
		System.out.println("I am a private method");
	}
	
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.name = "John";
		emp.lastName = "Smith";
		emp.salary = 90000;
		emp.ssn = 345657676;
		//accessing all methods
		method1();
		emp.method2();
		emp.method3();
		emp.method4();
		
		
		
	}
	
}
