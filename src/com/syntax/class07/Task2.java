package com.syntax.class07;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter the number from 1 to 20");
		int num = scan.nextInt();

		while (num != 17) {
			System.out.println("Please enter the number from 1 to 20");
			num = scan.nextInt();
			if (num == 17) {
				System.out.println("Congrats");
			}
		}

	}

}
