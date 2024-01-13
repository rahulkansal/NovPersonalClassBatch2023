package com.java.practice;

public class ChildClass extends ClassAndObjectExample{
	
	public void subtraction(int a, int b) {
		int c =a -b;
		System.out.println(a-b);
	}
	
	public void addition(int a, int b) {
		System.out.println(a+b+a+b);
	}
	
	public void calculation() {
		super.addition(13.6, 50);
		int value =super.age;
		System.out.println(value);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassAndObjectExample classAndObjectExample = new ClassAndObjectExample();
		classAndObjectExample.addition(30, 20);
		
		ChildClass childClass = new ChildClass();
		childClass.subtraction(30, 10);
		childClass.addition(20, 30);
		childClass.calculation();
		
	}
	

}
