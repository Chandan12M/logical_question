package com.string;

public class Plindrome {
	public static void main(String[] args) {
		String s="chandan";
		String str="";
		
		for(int i=s.length()-1;i>=0;i--) {
			str=str+s.charAt(i);
		}
		if(s.equalsIgnoreCase(str)) 
			System.out.println("is palindrome");
			else
				System.out.println("is not a plindrome");
	
	}

}
