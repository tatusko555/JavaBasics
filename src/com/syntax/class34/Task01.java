package com.syntax.class34;

public class Task01 {

	public static void main(String[] args) {

		eligibility(12);
		
	}
	public static void eligibility(int age) {
		if(age<16) {
			throw new RuntimeException("You are too young");
			}
	}
		
}
