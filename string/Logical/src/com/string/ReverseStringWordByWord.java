package com.string;

public class ReverseStringWordByWord {
	
	
	public static void main(String[] args) {
		String s="my name is sonu";
		String str="";
		String[] ch=s.split("\\s");
		for(String word:ch){
			for(int i=word.length()-1;i>=0;i--){
				str=str+word.charAt(i);
			}
			str=str+" ";
		}
		System.out.println(str);
		
		/*
		 * doubt
		 char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++){
			int k=i;
			while(i<ch.length && ch[i]!=' '){
				i++;
			}
		}
		System.out.println(str);*/
	}
}

