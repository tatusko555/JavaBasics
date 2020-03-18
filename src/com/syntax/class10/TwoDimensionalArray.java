package com.syntax.class10;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		int[][] numbers = new int[3][4];
		// first row
		numbers[0][0] = 10;
		numbers[0][1] = 20;
		numbers[0][2] = 30;
		numbers[0][3] = 40;
		// second row
		numbers[1][0] = 5;
		numbers[1][1] = 10;
		numbers[1][2] = 15;
		numbers[1][3] = 20;
		// third row
		numbers[2][0] = 1;
		numbers[2][1] = 2;
		numbers[2][2] = 3;
		numbers[2][3] = 4;

		// print value 15
		System.out.println(numbers[1][2]);

		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::");
		// shorter way
		int[][] nums = { { 10, 20, 30, 40 }, { 5, 10, 15, 20 }, { 1, 2, 3, 4 } };
		System.out.println(nums[2][3]);// 4
		System.out.println(nums[0][2]);// 30
		
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::");
		
		String [][] month1 = {{"January","February","December"},{"March","April","May"},
							{"June","July","August"},{"September","October","November"}};
		System.out.println(month1[0][2]);
		System.out.println(month1[1][1]);
		System.out.println(month1[2][0]);
		
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::");
		
		String [][] month = {{"January","February","December"},{"March","April","May"},
							{"June","July","August"},{"September","October","November"}};
		
		int rows = month.length;//How many arrays
		int firstArray = month[3].length;
		System.out.println(firstArray);
		
		//print all the elements of 2D array
		for(int i =0; i<month.length; i++) {
			for(int j =0; j<month[i].length; j++) {
				System.out.print(month[i][j]+" ");
				
			}
			System.out.println();
		}
		
		
		
		
		
	}
}
