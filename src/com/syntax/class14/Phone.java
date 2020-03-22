package com.syntax.class14;

public class Phone {
	
	public static void main(String[] args) {
			PhoneSpecs iphone=new PhoneSpecs();
			iphone.brand="Iphone";
			iphone.color="White";
			iphone.model="X Max";
			iphone.dial();
			iphone.text();
			iphone.pics();
			
			PhoneSpecs android=new PhoneSpecs();
			android.brand="Samsung";
			android.color="Black";
			android.model="Note10";
			android.dial();
			android.text();
			android.pics();
			
			PhoneSpecs nokia=new PhoneSpecs();
			nokia.brand="Nokia";
			nokia.color="Gray";
			nokia.model="Nokia 9";
			nokia.dial();
			nokia.text();
			nokia.pics();
			
			String str = "Hello friends";
			str = str.replace("Hello", "Welcome");
			System.out.println(str);
	}
		

}
