package com.java.practice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Object> set=new HashSet<Object>();  
		set.add("Ravi");  
		set.add("Vijay");  
		set.add("Ravi"); 
		set.add(null);
		set.add(null);
		set.add(40);
		set.add('y');
		//Traversing elements  
		Iterator<Object> itr=set.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  }

	}

}
