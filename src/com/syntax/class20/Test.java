package com.syntax.class20;

public class Test {

	public static void main(String[] args) {
		
		
		Employee emp = new Employee();
		emp.empNumber= 101;
		emp.salary = 100000;
		emp.getPaid();
		Employee.company = "Syntax";
		Employee.work();
		
		
		ScrumTeam obj2 = new ScrumTeam();
		obj2.empNumber = 123;
		obj2.salary = 234346;
		
		obj2.ceremonies = "Daily meetings, Sprint grooming, Sprint planning, Sprint demo";
		obj2.attendMeetings();
		
		Tester obj3 = new Tester();
	}
}
