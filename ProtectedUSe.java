package com.brainmentors.java.oops;

class Human
{
	protected String name = "Ram Kumar";
}

class Employee extends Human
{
	public void print()
	{
		System.out.println(name);
	}
}


public class ProtectedUSe {
	
	public static void main(String[] args) {
		
		Employee e = new Employee();
		e.print();
		
	}

}
