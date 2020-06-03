package com.string;

public class findCharaterno {
	public static void main(String[] args) {
		/*
		 * String s="my name is chandan from kolk"; String str=" "; int count=0;
		 * System.out.println(s.length()); for(int i=0;i<s.length();i++) {
		 * if(s.charAt(i)==' ') { System.out.println(str+" "+str.length()); str="";
		 * count=0; } else { count++; str=str+s.charAt(i); }
		 * 
		 * }
		 */
		String s="chandan is from  kolkata ";
		String[] words=s.split("\\s");
		for(String word:words) {
			char[] ch=word.toCharArray();
			int length=ch.length;
			System.out.println(word+" came "+length+" times ");
		}
	}

}
