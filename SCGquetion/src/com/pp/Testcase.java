package com.pp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Testcase {
	@Test
	public void test() {
		
		Square s=new Square();
		int expected=10;
		int actual=s.add(8, 2);
		
		assertEquals(expected, actual);
		
		
		
	}
	
	  @Test public void test1() {
	  
	  Square s1=new Square(); 
	  
	  
	  int expected=20;
	  int actual=s1.mul(10, 2);
	  
	  assertEquals(expected, actual);
	  
	  
	  }
	 
	
}