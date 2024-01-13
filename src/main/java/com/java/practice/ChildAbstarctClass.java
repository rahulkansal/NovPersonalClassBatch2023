package com.java.practice;

public class ChildAbstarctClass extends SuperAbstractClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildAbstarctClass childAbstarctClass = new ChildAbstarctClass();
		childAbstarctClass.display();
		childAbstarctClass.display1();
	}

	@Override
	public void display1() {
		// TODO Auto-generated method stub
		System.out.println("Display1");
	}

}
