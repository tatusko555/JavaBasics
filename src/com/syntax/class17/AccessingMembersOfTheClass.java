package com.syntax.class17;

public class AccessingMembersOfTheClass {

	public static void main(String[] args) {

		Employee emp1 = new Employee();
		Employee.title = "QA";
		emp1.name = "Joshua";
		emp1.lastName = "Saith";
		emp1.salary = 100000;
		//emp1.ssn = 345645676;CE: ssn is not visible
		//accessing all methods
		Employee.method1();
		emp1.method2();
		emp1.method3();
		//emp1.method4();CE: is not visible 
		
		
	}

}
