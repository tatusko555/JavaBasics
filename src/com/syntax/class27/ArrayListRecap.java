package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListRecap {

	public static void main(String[] args) {
//lets create array list that stores Double types of objects
//generic arrayList		
		
		ArrayList<Double> alist = new ArrayList<>(); //<----generic ArrayList
		alist.add(10.99);
		alist.add(12.90);
		alist.add(100.99);
		
		System.out.println(alist);
		//replace element
		alist.set(1, 13.90);
		System.out.println(alist);
		
		//remove element
		alist.remove(13.90);
		System.out.println(alist);
		
		//retrieve single element
		System.out.println(alist.get(1));
		
		//retrieve all elements from collection
		for(double a:alist) {
			System.out.println(a);
		}
		System.out.println("==================================");
		for(int i = 0; i<alist.size(); i++) {
			double d = alist.get(i);
			System.out.println(d);
		}
		System.out.println("================ITERATOR==================");
		
		Iterator<Double> iterator=alist.iterator();
		while(iterator.hasNext()) {
			Double d = iterator.next();
			System.out.println(d);
		}
		
		
		
		
		System.out.println("========NON GENERIC COLLECTION===========");
		
		//non generic ArrayList
		ArrayList obj = new ArrayList();
		obj.add("Hello");//store single object
		obj.add(100);//compiler allows this
		obj.add(6.99);//compiler allows this
		obj.addAll(alist);// store collection object
		
		System.out.println(obj);
		System.out.println("==================================");
		//retrieve all elements from collection
		for(Object o:obj) {
			System.out.println(o);
		}
		
		
	}

}
