package com.syntax.class04;

public class TaskDiploma {

	public static void main(String[] args) {

		boolean diploma=true;
		double gpaScore=4.2;
		
		if(diploma) {
			System.out.println("Congratulations!!!");
			if(gpaScore>=3.5) {
				System.out.println("You are eligible for scolarship");
			}else {
				System.out.println("You should have studied harder.");
			}
		}
		else {
			System.out.println("You should get a degree!!!");
		}
		
		
	}

}
