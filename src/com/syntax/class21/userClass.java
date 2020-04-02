package com.syntax.class21;

public class userClass {
//	Write program: userClass  that has a constructor
//	that initializes instance variable name and mobile number.
//	Create a subclass  userInfo that will have user address variable 
//	and it also being initialized through constructor call. 
//	Print users name, mobile number and address in userDetails method. Test your code.
	String name; 
	int mobileNumber;
	
	public userClass(String name, int mobileNumber) {
		
			this.name = name;
			this.mobileNumber = mobileNumber;
		
	
	}
	
}
class userInfo extends userClass{
	String address;
	
	userInfo(String name, int mobileNumber, String address) {
		super(name, mobileNumber);
		this.address = address;
	}
	public void userDetails() {
		System.out.println("My name is "+name+" and my phone number is "+mobileNumber+" . i live at: "+address);
	}
	
}




