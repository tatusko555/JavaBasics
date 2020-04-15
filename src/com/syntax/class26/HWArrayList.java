package com.syntax.class26;

import java.util.ArrayList;

public class HWArrayList {

	public static void main(String[] args) {

//	Create a generic ArrayList that will store 5 names into it. 
//	Find out whether the given ArrayList is empty or not? 
//	Check whether the specific name is present in an ArrayList or not?
//	Find the size of your arrayList and print all values from that
	
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Andrii");
		arrayList.add("John");
		arrayList.add("Tom");
		arrayList.add("Peter");
		arrayList.add("Kate");
		
		if(!arrayList.isEmpty()) {
			System.out.println("Array is not empty");
		}
		else {
			System.out.println("Array is empty");
		}
		System.out.println("------------------------");
		if(arrayList.contains("Andrii")) {
			System.out.println("Andrii is inside the array");
		}
		else {
			System.out.println("Andrii is not a part of an array :(");
		}
		System.out.println("------------------------");
		System.out.println("Array has "+arrayList.size()+" elements");
		for(String str: arrayList) {
			System.out.println(str);
		}
	}

}
