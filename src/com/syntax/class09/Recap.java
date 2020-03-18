package com.syntax.class09;

public class Recap {

	public static void main(String[] args) {
		// using nested loop print 10 until 99

		for (int i = 1; i <= 9; i++) {
			for (int y = 0; y <= 9; y++) {
				System.out.println(i + "" + y);
			}
		}
		System.out.println("-------------------------------");
		//print military clock 00:00 to 23:59
		
		for (int a=0; a<24; a++) {
			for (int b=0; b<60; b++) {
				if (a>=10 && b<10) {
					System.out.println(a+":0"+b);
				}else if (a<10 && b>=10) {
					System.out.println("0"+a+":"+b);
				}else if (b<10 && a<10) {
					System.out.println("0"+a+":0"+b);
				}else
				System.out.println (a+":"+b);
				}
			}
	}
}