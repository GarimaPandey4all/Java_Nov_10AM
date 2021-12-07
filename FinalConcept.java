package com.brainmentors.java.oops;

final class Example
{
	public final void display()
	{
		System.out.println("Hello World");
	}
}

class JavaExample extends Example{
	
	public void show()
	{
		System.out.println("Java Example");
	}
	
	@Override
	public void display()
	{
		System.out.println("Hello World in Java Example");
	}
	
}

public class FinalConcept {
	
	public static void main(String[] args) {
		
		//variable constant: final keyword
		
		final float pi = 3.14f;
		
		//pi = 45.6f;
		
		System.out.println(pi);
		
		
	}

}
