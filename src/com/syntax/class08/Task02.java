package com.syntax.class08;

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {

		/*
		 * 1.Write a program that reads a range of integers (start and end point),
		 * provided by a user and then from that range prints the sum of the even and
		 * odd integers.
		 * 
		 * 
		 * 2.Write a program to ask a user to enter item they want to buy and the price of
		 * that item. Every time user enters money accumulate the amount and tell the
		 * user how much is left to pay off the amount. If user give more money program
		 * should return a change. Whenever a user done with payments program should say
		 * “Thank you for shopping!”
		 */

		Scanner scan= new Scanner(System.in);
		System.out.println("Please enter first number:");
		int num1 = scan.nextInt();
		System.out.println("Please enter second number:");
		int num2 = scan.nextInt();
		int even = 0;
		int odd = 0;
		
		for(int i =num1; i<=num2; i++) {
			if(i%2==0) {
				 even +=i; 
			}else {
				odd +=i;
			}
		}
		System.out.println("Sum of even numbers is "+even);
		System.out.println("Sum of odd numbers is "+odd);
		
		
		System.out.println("---------------TASK 2--------------");
		
	}

}
