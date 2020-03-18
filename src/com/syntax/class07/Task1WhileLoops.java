package com.syntax.class07;

public class Task1WhileLoops {

	public static void main(String[] args) {

		boolean workDay = true;
		int day = 1;
		while (day < 6) {
			if (workDay) {
				System.out.println("I need a day off");

			} else {
				System.out.println("I don't need a day off anymore");
			}
			day++;

		}

	}

}
