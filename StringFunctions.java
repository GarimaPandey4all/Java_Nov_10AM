package com.brainmentors.java.stringhandling;

public class StringFunctions {
	
	public static void main(String[] args) {
		
		String name = "Amiit";
		
		System.out.println(name.length());
		System.out.println(name.charAt(0));
//		beginindex: index number - start from 0
//		endindex: position number - start from 1
		System.out.println(name.substring(1, 3));
		//System.out.println(name.trim());
		System.out.println(name.replace('i', 'e'));
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name.concat(" Kumar"));
		System.out.println(name+" Shrivastava");
		System.out.println(name.contains("mit"));
		System.out.println(name.indexOf("t"));
		System.out.println(name.lastIndexOf("i"));
		
	}

}
