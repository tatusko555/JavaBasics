package com.syntax.class25;

public class WebDriverTest {

	public static void main(String[] args) {

		WebDriver[] test = {new ChromeDriver(), new FireFoxDriver()};
		
		for (WebDriver i:test) {
			i.openBrowser();
			i.closeBrowser();
			i.maximizeWindow();
			i.findElement();
			System.out.println("------++++++++++-------");
		}
	}

}
