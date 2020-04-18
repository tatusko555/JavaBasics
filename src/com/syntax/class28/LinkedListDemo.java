package com.syntax.class28;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList<String> llist = new LinkedList<String>();
		llist.add("Yunus");// comes from Collection
		llist.add(0, "Reyhan");//comes from List
		llist.add("Pavel");
		llist.add("Farid");
		
		int size = llist.size();
		System.out.println(size);
		
		//get all elements one by one
		Iterator<String> it = llist.iterator();
		while(it.hasNext()) {
			
			System.out.print(it.next()+" ");
		}
		System.out.println();
		System.out.println("----------------------------");
		for(String list:llist) {
			System.out.print(list+" ");
		}
		System.out.println();
		System.out.println("----------------------------");
		for(int i=0; i<llist.size(); i++) {
			System.out.println(llist.get(i));
		}
		
		
		
	}

}
