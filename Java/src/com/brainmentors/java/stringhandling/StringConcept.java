package com.brainmentors.java.stringhandling;

public class StringConcept {

	public static void main(String[] args) {
		
		//String Literal Style , 1 or 0
		String name = "Ram"; 
		String name2 = "Ram";
		
		//String Object Style, 2 or 1
		//String name3 = new String("Ram").intern();
		String name3 = new String("Ram");
		String name4 = new String("Ram");
		
		System.out.println(name == name2); // reference comparison
		System.out.println(name == name3);
		System.out.println(name3 == name4);
		
		String t = "Hello";
		String y = t;
		System.out.println(y == t);
		
		t = t + "How are you";
		System.out.println(y == t);
				
	}
	
}
