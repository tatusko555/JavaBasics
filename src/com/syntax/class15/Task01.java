package com.syntax.class15;

public class Task01 {
	
	void larger(int a, int b) {
		if(a>b) {
			System.out.println(a+" is larger than "+b);
		}else if(b>a) {
			System.out.println(b+" is larger than "+a);
		}else {
			System.out.println("numbers are even");
		}
	}

	void evenOdd(int a) {
		if(a%2==0) {
			System.out.println(a+" is even number");
		}else {
			System.out.println(a+" is odd number");
		}
	}
	
	void palindrome(String word) {
		char[] charArray = word.toCharArray();
		String reverse = "";
		for (int i = charArray.length - 1; i >= 0; i--) {
			reverse += charArray[i];
		}
		if(word.equals(reverse)) {
			System.out.println("Yes, it is a palindrome");
		}else {
			System.out.println("No, it is not a palindrome");
		}
	}

	void language(String country) {
		
		switch(country) {
		case "Ukraine":
			System.out.println("Pryvit");
			break;
		case "USA":
			System.out.println("Hello");
			break;
		case "Spain":
			System.out.println("Ola");
			break;
		}
		
	}
	
	public static void main(String[] args) {
		
		Task01 obj = new Task01();
		obj.larger(34, 54);
		
		obj.evenOdd(5);
		
		obj.palindrome("hello world");
		
		obj.language("USA");
		
	}

}
