package com.syntax.class08;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		// 1.Print numbers from 1 to 50 except those that are divisible by 3

		// 2.Create a program that will be asking user to apply for a credit card 10
		// times. As soon you get an “yes” from a user program should stop asking.
	for(int i =1; i<=50; i++) {
		if(i%3==0) {
			continue;
		}
		System.out.println(i);
	}
	System.out.println("---------------TASK 2--------------");
	
	Scanner scan = new Scanner(System.in);
	for(int i = 1; i<=10; i++) {
		System.out.println("Would you like to apply for a credit card?");
		String answer = scan.nextLine();
		if(answer.equals("yes")) {
			System.out.println("Congrats");
			break;
		}
	}
	
	
	
	}

}
