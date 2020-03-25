package com.syntax.class16;

public class InstanceVariables {
	
	String name = "John";// Instance variable
	
	public static void main(String[] args) {
		
		
		String name = "Yunus";
		System.out.println(name);
		InstanceVariables obj = new InstanceVariables();
		System.out.println(obj.name);
		System.out.println();
		
		
		obj.name = "Ali";
		System.out.println(name);
		System.out.println(obj.name);
		
	}

}
