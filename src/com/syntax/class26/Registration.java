package com.syntax.class26;

public class Registration {

	private String email;
	private String userName;
	private String password;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		if (email.contains("yahoo")) {
		this.email = email;
		}
		else {
			this.email = "invalid email";
		}
		
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		if(!userName.isEmpty() && userName.length()>6) {
		
		this.userName = userName;
		}
		else {
			this.userName = "invalid user name";
		}
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		if(!password.isEmpty() && password.length()>6 && !password.contains(userName)) {
		this.password = password;
		}
		else {
			System.out.println("invalid password");
		}
	}
	
	
}
