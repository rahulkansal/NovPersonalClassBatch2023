package com.java.practice;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println(20/0);
		  try {
			  arrayIndex();
	      //   int a[] = new int[2];
	       //  System.out.println("Access element three :" + a[3]);
	      } catch (ArrayIndexOutOfBoundsException e) {
	         System.out.println("Exception thrown  :" + e);
	      }finally {
	    	   // The finally block always executes.
	    	  //Driver.quit();
	    	  System.out.println("finally ");
	    	  }


		
		System.out.println("After Exception");
	}
	
	
	public static void arrayIndex() throws  ArrayIndexOutOfBoundsException{
		 int a[] = new int[2];
         System.out.println("Access element three :" + a[1]);
	}

}
