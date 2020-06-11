package com.syntax.class34;

public class TryCatchFinally {

	public static void main(String[] args) {
		
		division(10, 5);
		division(10, 0);

	}

	
	public static void division(int num1, int num2) {
		
		try {
			System.out.println(num1/num2);
		}catch(ArithmeticException ae){
			ae.printStackTrace();//detailed message of an exception
			System.out.println(ae.getMessage());//message of an exception
			System.out.println(ae);
		}finally {
			System.out.println("I am a finally block");
		}
	}
}
