package com.syntax.class04;

import java.util.Scanner;

public class ScannerTask1 {

	public static void main(String[] args) {
		
		Scanner user=new Scanner(System.in);
		
		System.out.println("Please enter amount of loan needed:");
		int loanNeeded = user.nextInt();
		
		if (loanNeeded<=200000) {
			System.out.println("You can get a loan");
		}else {
			System.out.println("You cannot get a loan");
		}
	}

}
