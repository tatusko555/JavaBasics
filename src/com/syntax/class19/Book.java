package com.syntax.class19;

public class Book {
//	Write program as a Book class   that will have 2 Constructors. While creating an object make sure:
//	Instance variables are being initialized
//	Both Constructors are being executed
	String book1;
	String book2;
	
	public Book(String book1, String book2) {
		this();
		this.book1 = book1;
		this.book2 = book2;
		System.out.println(this.book1+" "+this.book2);
	}
	public Book() {
		System.out.println("I am here");
		
	}
	
	public static void main(String[] args) {
		Book obj = new Book("Hello","World");
		
	}
}
