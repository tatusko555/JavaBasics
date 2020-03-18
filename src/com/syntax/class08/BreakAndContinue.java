package com.syntax.class08;

public class BreakAndContinue {

	public static void main(String[] args) {

		//once i=4 --> we want to stop the loop
		
		for(int i=1; i<=10; i++) {
			if(i==4) {
				System.out.println("I'm stopping loop");
				break;
			}
			System.out.println(i);
		}
		System.out.println("I'm outside of the loop");
		
		
		System.out.println("________________CONTINUE________________");
		
		for(int y=1; y<=10; y++) {
			if(y==4) {
				System.out.println("Im stopping iteration");
				continue;
			}
			System.out.println("Im inside the loop");
			System.out.println(y);
		}
		System.out.println("________________CONTINUE________________");

		 //write a program that print numbers from 1 to 20
        // i do not want to print 5,6,7
        
        for(int i=1; i<21; i++) {
            
            if(i==5 || i==6 || i==7) {
                continue;
            }
            
            System.out.println(i);
        }

		
		
		
		
		
		
		
		
	}

}
