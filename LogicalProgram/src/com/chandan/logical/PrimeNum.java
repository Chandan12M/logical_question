package com.chandan.logical;

public class PrimeNum {
	public static void main(String[] args) {
		int num=4;
		boolean flag=false;
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				flag=true;
				break;
			}
		}
		if(!flag)
			System.out.println(num+"is a prime no");
		else
			System.out.println(num+"is not a prime");
	}

}
