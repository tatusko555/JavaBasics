package com.syntax.class03;

public class TemperatureCheck {

	public static void main(String[] args) {

		int temp = 28;
		int temp32 = 32;

		if (temp < temp32) {
			System.out.println("Water will freeze with temperature " + temp + ".");
		} else {
			System.out.println("Water will NOT freeze with temperature " + temp + ".");
		}

	}

}
