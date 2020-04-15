package com.syntax.class26;

public class RegistrationTest {

	public static void main(String[] args) {

		
		Registration reg = new Registration();
		reg.setEmail("user@yahoo.com");
		reg.setUserName("John");
		reg.setPassword("John2336");
		
		System.out.println(reg.getUserName());
		System.out.println(reg.getEmail());
		System.out.println(reg.getPassword());
	}

}
