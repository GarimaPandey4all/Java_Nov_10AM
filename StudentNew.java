package com.brainmentors.java.oops;

public class StudentNew {
	
	//Class Variables/Data Members/Instance Variables
	// Data Hiding
	private int rollno;
	private String name;
	private String phone;
	private String course;
	private double fees;
	private String collegeName;
	
	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	//Default Constructor
	public StudentNew()
	{
		//Called Parameterized Constructor
		this(101, "Ram Kumar", "32785438654", "MCA", 10000.0);
		collegeName = "SRCC";
	}
	
	//Parameterized Constructor
	public StudentNew(int rollno, String name, String phone, String course, double fees)
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
		StudentNew ram = new StudentNew();
		ram.print();
		
		ram.setPhone("8723746987");
		String phoneNumber = ram.getPhone();
		System.out.println(phoneNumber);
		ram.print();
		
		//Called Parameterized Constructor
		//Student ram = new Student(101, "Ram Kumar", "32785438654", "MCA", 10000.0);
		
		//ram.takeInput(101, "Ram Kumar", "32785438654", "MCA", 10000.0);
		
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
