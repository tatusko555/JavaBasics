package com.syntax.class27;

public abstract class Food {
	//2. hw create food class that will have 3 undefined methods and it will have 4 subclasses;
			//create a collection of food and using 3 ways execute methods
	public abstract void cook();
	public abstract void eat();
	public abstract void taste();
}
class Salad extends Food{

	@Override
	public void cook() {
		System.out.println("cook the salad");
		
	}

	@Override
	public void eat() {
		System.out.println("eat the salad");
		
	}

	@Override
	public void taste() {	
		System.out.println("salad tastes great");
		
	}
	
}
class Fruits extends Food{

	@Override
	public void cook() {
		System.out.println("fruits dont need to be cooked");
		
	}

	@Override
	public void eat() {
		System.out.println("fruits are ready to eat");
		
	}

	@Override
	public void taste() {
		System.out.println("fruits are the best");
		
	}
}
class Soup extends Food{

	@Override
	public void cook() {
		System.out.println("cook the soup");
		
	}

	@Override
	public void eat() {
		System.out.println("eat the soup");
		
	}

	@Override
	public void taste() {
		System.out.println("soup tastes delisious");
		
	}
	
}	
