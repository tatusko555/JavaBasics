package com.syntax.class03;

public class Task01 {

	public static void main(String[] args) {

		int month=2;
		
		if(month==1) {
			System.out.println("It's January!");
		}else if(month==2) {
			System.out.println("It's February!");
		}else if(month==3) {
			System.out.println("It's March!");
		}else if(month==4) {
			System.out.println("It's April!");
		}else if(month==5) {
			System.out.println("It's May!");
		}else if(month==6) {
			System.out.println("It's June!");
		}else if(month==7) {
			System.out.println("It's July!");
		}else if(month==8) {
			System.out.println("It's August!");
		}else if(month==9) {
			System.out.println("It's September!");
		}else if(month==10) {
			System.out.println("It's October!");
		}else if(month==11) {
			System.out.println("It's November!");
		}else if(month==12) {
			System.out.println("It's December!");
		}else {
			System.out.println("It's something else :)");
		}
		//task 2
		
		if(month%2==0) {
			System.out.println("Number is even!");
		}else {
			System.out.println("It's odd number!");
		}
		
		//task 3
		
		if (month>0) {
			System.out.println("Number is positive");
		}else if(month<0) {
			System.out.println("Number is negative");
		}else {
			System.out.println("Number equals to 0");
		}
	}

}
