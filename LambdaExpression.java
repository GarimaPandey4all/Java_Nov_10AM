package com.brainmentors.java.oops;

interface Addable {
	int add(int a, int b);
}

public class LambdaExpression {
	
	public static void main(String[] args) {
		
		//interface implement : lambda expression
		Addable obj = (a, b)->(a + b);
		System.out.println(obj.add(10, 20));
		
		Addable obj1 = (int a, int b)->(a + b);
		System.out.println(obj1.add(100, 200));
		
	}

}
