package com.syntax.class10;

public class Task01 {

	public static void main(String[] args) {

		String[] animals = {"Tiger","Shark","Eagle","Puma"};
		
		for(String animal:animals) {
			System.out.println(animal);
		}
		System.out.println("_____________-----------------_____________");
		
		for(int i=0; i<animals.length; i++) {
			System.out.println(animals[i]);
		}
		System.out.println("================TASK 02=================");
		
		//Create an array on integers and calculate the sum of all integer elements in an array.
		
		int[] num = {45,23,85,24,65,14};
		int sum = 0;
		for(int num1:num) {
			sum +=num1;
		}
		System.out.println(sum);

		System.out.println("================TASK 03=================");
		//Create an array of countries. While retrieving all values from an array print capital for each country.
		//(use 2 different loops).
		String[] countries = {"USA","Ukraine","Spain","Canada"};
		for(String country:countries) {
			if(country.equals("USA")) {
				System.out.println("The capital of "+country+" is Washington DC");
			}
			if(country.equals("Ukraine")) {
				System.out.println("The capital of "+country+" is Kyiv");
			}
			if(country.equals("Spain")) {
				System.out.println("The capital of "+country+" is Madrid");
			}
			if(country.equals("Canada")) {
				System.out.println("The capital of "+country+" is Ottawa");
			}
		}
		System.out.println("###############################################");
		
		for(int i=0; i<countries.length;i++) {
			
			switch(countries[i]) {
			case "USA":
				System.out.println("The capital of "+countries[i]+" is Washington DC");
				break;
			case "Ukraine":
				System.out.println("The capital of "+countries[i]+" is Kyiv ");
				break;
			case "Spain":
				System.out.println("The capital of "+countries[i]+" is Madrid");
				break;
			case "Canada":
				System.out.println("The capital of "+countries[i]+" is Ottawa");
				break;	
			}
		}
		System.out.println("000000000000000000000000000000000000000000");
		 //Create an array of countries. 
        //While retrieving all values from an array print capital for each country. 
        //(use 2 different loops).
        
        String[] countries1= {"USA", "France", "Germany", "China", "Great Britain"};
        String[] capitals= {"Washington DC", "Paris", "Berlin", "Beijing", "London"};
        
        for(int i=0; i<countries1.length; i++) {
                System.out.println("The capital of "+countries1[i]+" is "+capitals[i]);
		
		
        }
		
		
		
		
		
		

	}

}
