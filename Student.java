package com.brainmentors.java.oops;

public class Student {
	
	//Class Variables/Data Members/Instance Variables
	// Data Hiding
	private int rollno;
	private String name;
	private String phone;
	private String course;
	private double fees;
	private String collegeName;
	
	//Default Constructor
	public Student()
	{
		//Called Parameterized Constructor
		this(101, "Ram Kumar", "32785438654", "MCA", 10000.0);
		collegeName = "SRCC";
	}
	
	//Parameterized Constructor
	public Student(int rollno, String name, String phone, String course, double fees)
	{
		//constructor chaining
		//this(); // call default constructor
		this.rollno = rollno;
		this.name = name;
		this.phone = phone;
		this.course = course;
		this.fees = fees;
	}
	
	//r, n, p, c, f are local variables
	
	//public void takeInput(int r, String n, String p, String c, double f)
//	public void takeInput(int rollno, String name, String phone, String course, double fees)
//	{
//		this.rollno = rollno;
//		this.name = name;
//		this.phone = phone;
//		this.course = course;
//		this.fees = fees;
//				
//		//instance variable = local variable
////		rollno = r;
////		name = n;
////		phone = p;
////		course = c;
////		fees = f;
//	}
	
	public void print()
	{
		System.out.println("Roll no is: "+this.rollno);
		System.out.println("Name is: "+name);
		System.out.println("Phone is: "+phone);
		System.out.println("Course is: "+course);
		System.out.println("Fees is: "+fees);
		System.out.println("College Name is: "+collegeName);
	}
	
	public static void main(String[] args) {
		
		//Called Default Constructor
		Student ram = new Student();
		
		//Called Parameterized Constructor
		//Student ram = new Student(101, "Ram Kumar", "32785438654", "MCA", 10000.0);
		
		//ram.takeInput(101, "Ram Kumar", "32785438654", "MCA", 10000.0);
		
		ram.print();
		
//		System.out.println("Roll no is: "+ram.rollno);
//		System.out.println("Name is: "+ram.name);
//		System.out.println("Phone is: "+ram.phone);
//		System.out.println("Course is: "+ram.course);
//		System.out.println("Fees is: "+ram.fees);
		
		//ram.print();
		
//		ram.rollno = 101;
//		ram.name = "Ram Kumar";
//		ram.phone = "2164064686";
//		ram.course = "MCA";
//		ram.fees = -10000.0;
		
		//ram.print();
		
//		System.out.println("Roll no is: "+ram.rollno);
//		System.out.println("Name is: "+ram.name);
//		System.out.println("Phone is: "+ram.phone);
//		System.out.println("Course is: "+ram.course);
//		System.out.println("Fees is: "+ram.fees);
		
		
	}

}
