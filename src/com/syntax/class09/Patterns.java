package com.syntax.class09;

public class Patterns {

	public static void main(String[] args) {

		for (int a = 1; a <= 10; a++) {

			for (int b = 1; b <= 10; b++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("==============PRINTING PATTERN 5X10===================");
		for (int a = 1; a <= 5; a++) {

			for (int b = 1; b <= 10; b++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("============PRINTING 5 ROWS OF 1-9================");

		for (int i = 1; i <= 5; i++) {
			for (int y = 1; y <= 9; y++) {
				System.out.print(y);
			}
			System.out.println();
		}
		System.out.println("============================");
		for (int i = 1; i <= 5; i++) {
			for (int y = 5; y >= 1; y--) {
				System.out.print(y);
			}
			System.out.println();
		}
		System.out.println("============================");
		for (int i = 5; i >= 1; i--) {
			for (int y = 5; y >= 1; y--) {
				System.out.print(i);
			}
			System.out.println();
		}

	}

}
