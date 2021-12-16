package com.brainmentors.java.exceptionhandling;

public class ExceptionConcept {
	
	static void dao() throws ArithmeticException
	{
		System.out.println("Connection Open");
		try {
			int e = 100/0; // throw ArithmeticException
			System.out.println("Query and Get the Result");
			System.out.println("Send Result to Helper");
		}
		
		// finally is a block which always execute.
		finally
		{
			System.out.println("Connection Close");
		}
	}
	
	static void helper() throws ArithmeticException
	{
		System.out.println("Call DAO");
		dao();
		System.out.println("Get Result from DAO");
		System.out.println("Send Result to View");
	}
	
	
	static void view()
	{
		System.out.println("Call Helper");
		try {
		helper();
		}
		//Globally Exception Handling
		catch(Exception e)
		{
			System.out.println("System Error");
			return;
		}
//		catch(ArithmeticException e)
//		{
//			System.out.println("You tried to divide a number by zero");
//			return;
//		}
		System.out.println("Get Result from Helper");
		System.out.println("Print Result to User");
	}
	
	public static void main(String[] args) {
		
		view();
		
	}

}
