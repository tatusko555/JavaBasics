package com.syntax.class11;

public class MoreExamples2DArray {

	public static void main(String[] args) {

		//lets create 2D array in which we store professions
		
		String[][] professions= {
				{"QA testers","DEV","Product Owner","Scrum Muster"},
				{"Math","Science","ESL"},
				{"Dentist","Surgeon"}
		};
		//get elements using advanced for loop
		for(String[] occupation:professions) {
			for(String prof:occupation) {
				System.out.print(prof+" ");
			}
			System.out.println();
		}
		
		
	}

}
