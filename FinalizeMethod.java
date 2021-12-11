package com.brainmentors.java.oops;

public class FinalizeMethod {
	
	public static void main(String[] args) {
		
		FinalizeMethod obj = new FinalizeMethod();
		
		obj = null; // unused
		
		System.gc();
		System.out.println("Main Completes");
		
	}
	
	//override this finalize method
	public void finalize()
	{
		System.out.println("Finalize Method Overridden");
	}

}
