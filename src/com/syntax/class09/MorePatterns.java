package com.syntax.class09;

public class MorePatterns {

	public static void main(String[] args) {

		for(int i=1; i<=4; i++) {
			
			for(int k=1; k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("+++++++++++++++++++++++++++++++++++");
		
		for(int i=1; i<=5; i++) {
			
			for(int k=1; k<=i;k++) {
				System.out.print(k+" ");
			}
			System.out.println();
		}



	}

}
