package com.syntax.class11;

public class Task02 {

	public static void main(String[] args) {

//		Create an array of countries: north america countries, south america countries,
//		europe countries, asian countries, african countries. Then print all values from
//		that array using 2 different loops and calculate how many total countries been stored.
		String[][] countries = {{ "Canada","USA",},
								{ "Peru","Brazil","Argentina" },
								{"Ukraine","Englang","Finland"},
								{"Mongolia","China","India"},
								{"Egypt","South Africa","Cameroon"}};
		int count = 0;
		int count1 = 0;
		for (int i = 0; i < countries.length; i++) {
			for(int j=0;j<countries[i].length;j++) {
				System.out.print(countries[i][j]+" ");
				count++;
			}
			System.out.println();
		}
		System.out.println("Total: "+count);
		
		
		
		System.out.println("============================");
		
		for (String[] country : countries) {
			for(String x:country) {
				System.out.print(x+" ");
				count1++;
			}
			System.out.println();
			
		}
		System.out.println("Total: "+count1);
		
		
		
	}

}
