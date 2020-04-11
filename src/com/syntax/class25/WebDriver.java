package com.syntax.class25;

public interface WebDriver {

	void openBrowser();
	void closeBrowser();
	void maximizeWindow();
	void findElement();
	
} 
class ChromeDriver implements WebDriver{
	@Override
	public void openBrowser() {
		System.out.println("We can open Chrome");
	}
	@Override
	public void closeBrowser() {
		System.out.println("we can close Chrome");
		
	}
	@Override
	public void maximizeWindow() {
		System.out.println("We can maximize Chrome window");
		
	}
	@Override
	public void findElement() {
		System.out.println("We can find element in Chrome");
		
	}
	
}
class FireFoxDriver implements WebDriver{
	@Override
	public void openBrowser() {
		System.out.println("We can open FireFox");
		
	}
	@Override
	public void closeBrowser() {
		System.out.println("We can close FireFox");
		
	}
	@Override
	public void maximizeWindow() {
		System.out.println("We can maximize FireFox window");
		
	}
	@Override
	public void findElement() {
		System.out.println("We can find elements in FireFox");
		
	}
	
}
