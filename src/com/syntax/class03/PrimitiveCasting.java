package com.syntax.class03;

public class PrimitiveCasting {

	public static void main(String[] args) {

		double d = 10;
		System.out.println(d);// 10.0

		// int i=10.99;--->compile time error saying:
		// type mismatch, cannot convert double to int
		int i = (int) 10.99;
		System.out.println(i);

		// byte -128 to 127
		byte b = (byte) 128;
		System.out.println(b);
	}

}
