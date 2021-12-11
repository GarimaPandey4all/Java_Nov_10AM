package com.brainmentors.java.oops;

class Parent {
	void show()
	{
		System.out.println("Parent Class");
	}
}

class Child extends Parent {
	@Override
	void show()
	{
		System.out.println("Child Class");
	}
	
	void showChild()
	{
		System.out.println("Child Class Unique Method");
	}
}

public class UpcastingAndDowncasting {
	
	public static void main(String[] args) {
		
		//Upcasting
//		Parent obj = new Child();
//		obj.show();
		
//		Child obj1 = new Child();
//		obj1.showChild();
		
		//Downcasting
		//Child obj2 = new Parent(); // compile time error
		
		Parent obj = new Child();
		Child obj1 = (Child)obj;
		
		obj1.show();
		obj1.showChild();
	}
}
