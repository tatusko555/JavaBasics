package com.syntax.class24;


public class Kitten3 extends Cat{
  String animal1;
  public Kitten3(String animal,String animal1) {
		super(animal);
		this.animal1 = animal1;
	}
void eat(){
    System.out.println(animal1+" eats milk");
  }
  void sleep(){
    System.out.println(animal1 +" sleeps a lot");
  }
}