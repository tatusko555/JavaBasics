package com.syntax.class23;

public class ComputerTest {

	public static void main(String[] args) {

		
		Computer[] comp = {new Apple("Apple"), new Lenovo("Lenovo"), new HP("HP"),new Dell("Dell")} ;
			for(Computer c:comp) {
				c.hasOS();
				System.out.println("------------------------");
			}
	}

}
