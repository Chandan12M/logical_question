package com.string;

public class Sorting {
	public static void main(String[] args) {
		
	
	String s="chandan";
	char[] ch=s.toCharArray();
	
	sort(ch);
	for(int i=0;i<ch.length;i++) {
		System.out.print(ch[i]);
		
	}

}
private static void sort(char[] ch) {
	for(int i=0;i<ch.length;i++) {
		for(int j=i+1;j<ch.length;j++) {
			if(ch[i]>ch[j]) {
				char temp=ch[i];
				ch[i]=ch[j];
				ch[j]=temp;
				
			}
		}
	}
}
}
