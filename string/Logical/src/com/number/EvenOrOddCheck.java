package com.number;

public class EvenOrOddCheck {

	/*
	 * public static void main(String[] args) { int num=11; boolean flag=false;
	 * if(num%2==0){ flag=true; } if(flag) System.out.println(num+" is even no");
	 * else System.out.println(num+" is not a even no"); }
	 */
	public static void main(String[] args) {
		int num=12;
		boolean flag=false;
		if(num%2==0) {
			flag=true;
		}
		if(flag)
			System.out.println("is even");
		else
			System.out.println("is odd");
		
	}

}