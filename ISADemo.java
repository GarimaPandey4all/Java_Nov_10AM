package com.brainmentors.java.oops;

//Parent Class
class Person {
	private String name;
	
	public Person(String name)
	{
		this.name = name;
		//name = "Brain Mentors";
	}
	
	public void printName()
	{
		System.out.println("Name of the Person is: "+name);
	}
}

//Child Class
class Student extends Person // Inheritance
{
	private int id;
	
	public Student()
	{
		//super(); // Parent Default Cons Call (Implicit Super Call)
		super("Brain Mentors");  //parent param cons call 
		id = 101;
	}
	
	public void printId()
	{
		System.out.println("Student Id is: "+id);
	}	
}

public class ISADemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student = new Student();

		student.printId();
		student.printName();
	}

}
