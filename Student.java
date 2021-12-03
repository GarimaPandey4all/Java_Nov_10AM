package com.brainmentors.java.oops;

public class Student {
	
	//Class Variables/Data Members/Instance Variables
	int rollno;
	String name;
	String phone;
	String course;
	double fees;	
	
	public static void main(String[] args) {
		
		Student ram = new Student();
		
		System.out.println("Roll no is: "+ram.rollno);
		System.out.println("Name is: "+ram.name);
		System.out.println("Phone is: "+ram.phone);
		System.out.println("Course is: "+ram.course);
		System.out.println("Fees is: "+ram.fees);
		
		ram.rollno = 101;
		ram.name = "Ram Kumar";
		ram.phone = "2164064686";
		ram.course = "MCA";
		ram.fees = 10000.0;
		
		System.out.println("Roll no is: "+ram.rollno);
		System.out.println("Name is: "+ram.name);
		System.out.println("Phone is: "+ram.phone);
		System.out.println("Course is: "+ram.course);
		System.out.println("Fees is: "+ram.fees);
		
		
	}

}
