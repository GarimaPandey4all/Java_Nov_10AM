package com.brainmentors.java.oops;

abstract class PersonNew {
	
	private String name;
	private int age;
	
	public PersonNew(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public void print()
	{
		System.out.println(name +" "+ age);
	}
	
	public abstract void contNumber(); 
}

class StudentN extends PersonNew {
	private int id;
	
	public StudentN(int id)
	{
		super("Ram", 25);
		this.id = id;
	}
	
	public void printId()
	{
		System.out.println(id);
	}
	
	@Override 
	public void contNumber()
	{
		System.out.println("Student's Contact Number");
	}
}

public class AbstractConcept {
	
	public static void main(String[] args) {
		
		StudentN student = new StudentN(100);
		student.print();
		student.printId();
		student.contNumber();
		
		//PersonNew person = new PersonNew(); // error
		
	}
}
