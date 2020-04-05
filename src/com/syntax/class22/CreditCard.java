package com.syntax.class22;

public class CreditCard {

//	Create a class CreditCard and define variable balance and interest. 
//	Create an instance method that will calculate interest based on the given balance. 
//	Create 2 subclasses: Visa and AX. In AX class override method calculate interest. 
//	Call the method by creating an object of each of the three classes.
	
	double balance, interest;
	
	public CreditCard(double balance) {
		this.balance = balance;
	}
	
	double getInterest() {
		if(balance<1500) {
			interest = balance*0.5;
		}else {
			interest = 0;
		}
		return interest;
	}
	
	
}
class Visa extends CreditCard{
	public Visa(double balance) {
		super(balance);
	}
}
class AX extends CreditCard{
	
	
	public AX(double balance) {
		super(balance);
	}
	@Override
	double getInterest() {
		if(balance<1500) {
			interest = balance*0.3;
		}else {
			interest = 0;
		}
		return interest;
	}
	
}