package com.syntax.class12;

public class SplitFunction {

	public static void main(String[] args) {
		System.out.println("--------split() FUNCTION-------");
		
		String today = "Today is my favorite Java class";
		String[] array = today.split("my");
		System.out.println(array.length);
		System.out.println(array[0]);
		System.out.println(array[1]);
		
		String today1 = "Today is my favorite Java class";
		String[] array1 = today.split("a");
		System.out.println(array1.length);
		for(String arr:array1) {
			System.out.print(arr+"*");
		}
		System.out.println();
		
		System.out.println("----------------------------");
        //we want to print String word by word
        String today2="Today is my favorite Java class";
        String[] words=today2.split(" ");
        
        for(int i=0; i<words.length;i++) {
            
            System.out.println(words[i]);
        }

		
		
	}

}
