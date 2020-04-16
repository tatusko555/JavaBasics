package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class HomeWork4 {

	public static void main(String[] args) {
		//4. Create an arrayList of even numbers from 1 to 50. 
		//Using Iterator remove any number that is divisible by 5 from that arrayList.
	
	ArrayList<Integer> numbers = new ArrayList<Integer>();
		for(int i = 1; i<=50; i++) {
			if(i%2==0) {
				numbers.add(i);
			}
		}
		System.out.println(numbers);

		Iterator<Integer> pick = numbers.iterator();
		while(pick.hasNext()) {
			if(pick.next()%5==0) {
				pick.remove();
			}
		}
		System.out.println(numbers);
	}

}
