package com.syntax.class16;

public class LocalVariables {
	
	void nameInside() {
		
		String name = "John";// visible only inside nameInside method
		
	}
	public static void main(String[] args) {
		
		//System.out.println(name); CE name wont be visible to another method
		//since its scope only within nameInside method
		LocalVariables obj = new LocalVariables();
		obj.nameInside();
		
		boolean flag = true;
		
		if(flag) {
			String answer = "Yes";
		}
		//System.out.println(answer); CE --> outside if_block
	}
}
