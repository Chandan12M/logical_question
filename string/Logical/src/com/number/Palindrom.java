package com.number;

public class Palindrom {

	public static void main(String[] args) {
		int num=122;
		int r=0,c=0;
		int temp=num;
		while(num!=0){
			r=num%10;
			c=(c*10)+r;
			num=num/10;
		}
		if(c==temp){
			System.out.println(temp+" is a palindrom no");
		}else{
			System.out.println(temp+" is not palindrom no");
		}
	}

}
