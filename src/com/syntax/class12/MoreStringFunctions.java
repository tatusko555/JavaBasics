package com.syntax.class12;

public class MoreStringFunctions {

	public static void main(String[] args) {

		System.out.println("---------replace() FUNCTION-------");
		
		String me = "I am a good tester";
		String newString = me.replace("a", "c");
		
		System.out.println(newString);
		
		me = me.replace("good", "great");
		System.out.println(me);
		
		System.out.println("---------replaceAll() FUNCTION-------");
		
		String str = "Phone number is 234567890";
		System.out.println(str);
		str=str.replaceAll("[A-Za-z]", "");
		
		System.out.println(str);
		
		String str1 = "Hello56778**5548^% !!87";
		System.out.println(str1);
		str1=str1.replaceAll("[0-9]", "");
		
		System.out.println(str1);
		
		String str2 = "Pho%&^**(ne numbe5685743lksejdhsfalr is 234567890";
		System.out.println(str2);
		str2=str2.replaceAll("[^A-Za-z0-9]", "");//replace special characters
		
		System.out.println(str2);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
