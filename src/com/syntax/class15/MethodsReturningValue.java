package com.syntax.class15;

public class MethodsReturningValue {

	public static void main(String[] args) {

		//create a String and based on the length of the String 
		//we define whether String is short or long
		
		String str = "Hello my friend";
		int length = str.length();
		
		if(length>10) {
			System.out.println("String is long");
		}else {
			System.out.println("String is short");
		}
		
		//compare 2 numbers and then we identify whether largest number is even or odd
		Task01 obj = new Task01();
		//int num = obj.larger(10, 20);-->CError
		MethodsReturningValue newObject = new MethodsReturningValue();
		int num = newObject.largest(12, 13);
		System.out.println(num);
		boolean flag = newObject.isOdd(num);
		System.out.println(flag);
		
		
	}
	//create a method that returns largest number from 2 given numbers
	
	int largest(int a, int b) {
		int largest;
		if(a>b) {
			largest = a;
		}else {
			largest = b;
		}
		return largest;
	}
	
	boolean isOdd(int num) {
		boolean isOdd;
		
		if(num%2==0) {
			isOdd = false;
		}else {
			isOdd = true;
		}
		return isOdd;
	}
	
	
}
