package com.brainmentors.java.oops;

class A {
	
	int x;
	
	A()
	{
		//this(20);
		System.out.println("A default Cons Call");
	}
	
	A(int x)
	{
		this();
		this.x = x;
		System.out.println("A Param Cons Call"+x);
	}
}

class B extends A{
	
	int x;
	
	B()
	{
		super(20);
		//this(10); // B param Cons Call
		System.out.println("B default Cons Call");
	}
	
	B(int x)
	{
		this();
		this.x = x;
		System.out.println("B Param Cons Call"+x);
	}
}

public class SupervsThis {
	
	public static void main(String[] args) {
		
		B obj = new B(10);
		
	}

}
