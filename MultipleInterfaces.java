package com.brainmentors.java.oops;

interface Printable {
	void print();
}

interface Showable {
	 void show();
}

class A1 implements Printable, Showable {

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
		System.out.println("Hello");
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Welcome");
	}
	
}

public class MultipleInterfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A1 obj = new A1();
		obj.show();
		obj.print();
		
	}

}
