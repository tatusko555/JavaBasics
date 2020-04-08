package com.syntax.class24;

public class FileTest {

	public static void main(String[] args) {
		
		File java = new JavaFile();
		java.open();
		java.edit();
		java.close();
		
		System.out.println("---------------------");
		File file = new WordFile();
		file.open();
		file.edit();
		file.close();
		
	}

}
