package com.brainmentors.java.stringhandling;

public class StringBufferStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder sb = new StringBuilder();
		//StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity()+" "+sb.length());
		
		sb.append("Hello");
		System.out.println(sb.capacity()+" "+sb.length());
		
		sb.append("How are you I am Fine");
		System.out.println(sb.capacity()+" "+sb.length());
		
		sb.append("Good Morning kshufdliwulgewjhefbwgeufgwkugfuwgkrugkwugr");
		System.out.println(sb.capacity()+" "+sb.length());
		
	}

}
