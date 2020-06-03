package com.string;

public class ReverseWordByword {
	
public static void main(String[] args) {
	String s="chandan is good boy";
	String str="";
	String [] ch=s.split("\\s");
	for(String word:ch) {
		for(int i=word.length()-1;i>=0;i--) {
			
			//str=str+word.charAt(i);	
		}
	str=str+" ";
	}
	System.out.println(str);
}
}

