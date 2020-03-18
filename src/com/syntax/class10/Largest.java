package com.syntax.class10;

import java.util.Arrays;

public class Largest {

	public static void main(String[] args) {
		// find largest element from an array
		int[] nums = { 200, 30, -1, 900, 56, 787 };
		int largest = nums[0];
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > largest) {
				largest = nums[i];
			}
		}
		System.out.println(largest);
//////////////////////////////////////////////////////////////////////////
		int max = Arrays.stream(nums).max().getAsInt();
		System.out.println("Largest in given array is " + max);

	}

}
