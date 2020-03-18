package com.syntax.class09;

public class Task01 {

	public static void main(String[] args) {

		for (int i = 5; i >= 1; i--) {

			for (int k = 1; k <= i; k++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		System.out.println("+++++++++++++++++++++++++++++++++++");

		for (int i = 1; i <= 5; i++) {

			for (int k = 1; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i = 1; i <= 5; i++) {

			for (int k = 4; k >= i; k--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
