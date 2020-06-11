package com.syntax.class31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileReading {

	public static void main(String[] args) throws IOException {

		String filePath = "/Users/andrii/eclipse-workspace/JavaBasics/configs/Task01.properties";
		System.out.println(filePath);
		
		String userDirectory = System.getProperty("user.dir");
		System.out.println(userDirectory);
		
		String filePath1 = System.getProperty("user.dir")+"/configs/Task01.properties";
		FileInputStream fis = new FileInputStream(filePath1);
		
		Properties prop = new Properties();
		prop.load(fis);
		
		String browser = prop.getProperty("browser");
		System.out.println(browser);
		
		String url = prop.getProperty("url");
		System.out.println(url);
		
	}

}
