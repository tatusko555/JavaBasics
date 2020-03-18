package com.syntax.class02;

public class Task4 {

	public static void main(String[] args) {

		int myNum1 = 63, myNum2 = 89;
		myNum1 += 100;
		myNum2 -= 67;
		System.out.println(myNum1);
		System.out.println(myNum2);

		int cakePiece = 11;
		int people = 4;
		int peopleGet = cakePiece / people;

		System.out.println("Each person will get " + peopleGet + " pieces of cake.");

		int newCake = 25;
		int morePeople = 7;
		newCake %= morePeople;

		System.out.println(
				"Only " + newCake + " pieces of cake left after i share it with " + morePeople + " students :(");
	}

}
