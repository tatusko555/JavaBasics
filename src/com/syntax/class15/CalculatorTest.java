package com.syntax.class15;

public class CalculatorTest {

	public static void main(String[] args) {

		Calculator calc = new Calculator();
		calc.add(100, 200);
		calc.sub(1000, 300);
		
		calc.add(1000, 2002);
		calc.sub(100, 30);
		
		calc.div(340, 2);
		calc.mult(65, 2);
	}

}
