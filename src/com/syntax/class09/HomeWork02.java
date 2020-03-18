package com.syntax.class09;

public class HomeWork02 {

	public static void main(String[] args) {
		// Create an array of names and store all names of your group.
		//Then print your name from that array. 
		//(use 2 different ways of creating an array).

		String[] name = new String[7];
		
		name[0] = "Eliza";
		name[1] = "Valeriy";
		name[2] = "Andrey";
		name[3] = "Anton";
		name[4] = "Pavel";
		name[5] = "Andrii";
		name[6] = "Margarita";
		
		System.out.println("My name is "+name[5]);
		System.out.println("<<<<<<<<<<<<>>>>>>>>>>>>>><<<<<<<<<<<>>>>>>>>>>>>");
		
		String[] name1 = {"Eliza","Valeriy","Andrey","Anton","Pavel","Andrii","Margarita"};
		System.out.println("My name is: "+name1[5]);
		System.out.println("<<<<<<<<<<<<>>>>>>>>>>>>>><<<<<<<<<<<>>>>>>>>>>>>");
		
		
		String [] day= {"Java","Saturday","day","coding","is"};
		System.out.println(day[1]+" "+day[4]+" "+day[0]+" "+day[3]+" "+day[2]);
		
	}

}
