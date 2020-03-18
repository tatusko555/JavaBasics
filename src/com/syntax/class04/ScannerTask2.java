package com.syntax.class04;

import java.util.Scanner;

public class ScannerTask2 {

	public static void main(String[] args) {

		Scanner dmv=new Scanner(System.in);
		
		System.out.println("Please enter your age: ");
		int age=dmv.nextInt();
		
		if(age>=18) {
			System.out.println("You are "+age+" years old and can get a drivers license");
		}else {
			System.out.println("You are too young but can get a learning permit");
		}
		
	}

}
