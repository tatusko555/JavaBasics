package com.syntax.class31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Task01 {

	public static void main(String[] args) throws IOException {

		String filePath = "/Users/andrii/eclipse-workspace/JavaBasics/configs/Task01.properties";
		
		FileInputStream fileInput = new FileInputStream(filePath);
		
		Properties prop = new Properties();
		prop.load(fileInput);
		
		String browser = prop.getProperty("browser");
		System.out.println(browser);
		
		String url = prop.getProperty("url");
		System.out.println(url);
		
	}

}
