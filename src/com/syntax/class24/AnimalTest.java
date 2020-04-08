package com.syntax.class24;

public class AnimalTest {

	public static void main(String[] args) {

		 Cat[] animal ={new Cat("Cat"), new Kitten1("Cat","kitten1"),new Kitten2("Cat","kitten2"), new Kitten3("Cat","kitten3")};
		    for(Animal ct:animal){
		      ct.eat();
		      ct.sleep();
		    }
	}

}
