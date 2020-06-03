package com.string;

public class CountNoword {
	public static void main(String[] args) {
		String s="india is my country";
		String str="";
		int count=0;
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ') {
				System.out.println(str+".."+str.length());
				str="";
				count=0;
			}
			else {
				count++;
				str=str+s.charAt(i);
			}
		}
	}
}
