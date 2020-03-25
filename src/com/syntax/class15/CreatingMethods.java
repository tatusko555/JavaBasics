package com.syntax.class15;

public class CreatingMethods {
	
	//we want to create a method that will accept marks (90, 80)
	//and based on marks it will return grade(A, B, C)
	//if grade>90-->A, 90<grade> -->B, 80<grade>70 -->C
	
	char getGrade(int mark) {
		char grades;
		
		if(mark>=90) {
			grades = 'A';
		}else if(mark<90 && mark>=80) {
			grades = 'B';
		}else if(mark<80 && mark>=70) {
			grades = 'C';
		}else {
			grades = 'D';
		}
		
		
		return grades;
	}
	public static void main(String[] args) {
		CreatingMethods obj = new CreatingMethods();
		char grade = obj.getGrade(92);
		System.out.println(grade);
		
		//if grade is A or B -->good job, otherwise--> study more
		
		if(grade=='A' || grade == 'B') {
			System.out.println("Good job");
		}else {
			System.out.println("Please study more");
		}
	}
	
}
