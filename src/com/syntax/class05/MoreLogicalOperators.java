package com.syntax.class05;

public class MoreLogicalOperators {

	public static void main(String[] args) {
		/*
		 * we have total 7 days in a week if day 2,3 --> SDLC class if day 6,7 --> Java
		 * class if day 1,5 --> day off if day 4 --> review class
		 */
		int day = 6;

		if (day == 2 || day == 3) {
			System.out.println("Today is SDLC class");
		} else if (day == 6 || day == 7) {
			System.out.println("Today is Java class");
		} else if (day == 1 || day == 5) {
			System.out.println("Today is day off");
		} else if (day == 4) {
			System.out.println("Today is review class");
		} else {
			System.out.println("Invalid day");
		}

		System.out.println("----------using strings----------");

		String day1 = "Saturday";

		if (day1.equals("Tuesday") || day1.equals("Wednesday")) {
			System.out.println("Today is SDLC class");

		} else if (day1.equals("Saturday") || day1.equals("Sunday")) {
			System.out.println("Today is Java class");

		} else if (day1.equals("Thursday")) {
			System.out.println("Today is review class");

		} else {
			System.out.println("Invalid day");
		}

	}

}
