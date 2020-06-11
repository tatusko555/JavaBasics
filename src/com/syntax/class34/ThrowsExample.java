package com.syntax.class34;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsExample {

	public static void main(String[] args) {

		multipleSleep();
		try {
			read("");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("====END OF THE CODE====");
	}

	public static void read(String filePath) throws FileNotFoundException {

		FileInputStream fis = new FileInputStream(filePath);
	}

	public static void multipleSleep() {
		try {
			sleep();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void sleep() throws InterruptedException {
		Thread.sleep(2000);
	}
}
