package com.string;

public class Swaping {
	public static void main(String[] args) {
		
		String s1="love";
		String s2="you";
		System.out.println("before swap the no :"+s1+" "+s2);
		s1=s1+s2;
		s2=s1.substring(0,s1.length()-s2.length());
		s1=s1.substring(s2.length());
		System.out.println("after swaping the no :"+s1+" "+s2);
		System.out.println("swap the problem.....");
		
	}

}
