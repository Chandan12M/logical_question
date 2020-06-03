package com.exception;

public class Example1 {
	public static void main(String[] args) {
		try {
			int a=Integer.parseInt(args[0]);
			int b=Integer.parseInt(args[1]);
			int c=a/b;
			System.out.println("Result :"+(a+b));
		} 
		
		
		  catch(ArrayIndexOutOfBoundsException e) {
		  System.out.println("Result :"+(5+6));
		  
		  }
		  
		  catch(NumberFormatException e) {
			  System.out.println("Result :"+(6+7));
		  
		  }
		 
		catch(ArithmeticException e) {
			System.out.println("Result :"+(8+9));
			
		}
	}

}
