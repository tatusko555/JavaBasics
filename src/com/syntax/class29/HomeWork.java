package com.syntax.class29;

import java.util.HashMap;
import java.util.Map;

public class HomeWork {

	public static void main(String[] args) {

//		Create a map of a building. Store floor number and it is associated company name. 
//		(Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values. 
//		Check how many entries you have?
//		Update company on a 4th floor 
//		Remove company on the 7th floor
//		Print your map
		
		Map<Integer, String> building = new HashMap<>();
		building.put(1, "Google");
		building.put(2, "Amazon");
		building.put(3, "Syntax");
		building.put(4, "Adidas");
		building.put(5, "Amazon");
		building.put(6, "Apple");
		building.put(7, "Sony");
		System.out.println(building);
		
		//how many entries are there?
		int size = building.size();
		System.out.println("building height is "+ size+ " floors");
		
		System.out.println("----------------Update company on a 4th floor---------------------");
		building.replace(4,"Nike");
		System.out.println(building);
		
		System.out.println("-----------------Remove company on the 7th floor--------------------");
		building.remove(7);
		System.out.println(building);
	}

}
