package com.local.number;

public class Febonaci {
	public static void main(String[] args) {
		/*int n=10,t1=0,t2=1;
		int sum;
		for(int i=1;i<n;i++) {
		 sum=t1+t2;
			t1=t2;
			t2=sum;
			System.out.println(sum);
*/		int a=0;
		int b=1;
		int c;
		for(int i=1;i<10;i++) {
			c=a+b;
			System.out.println(" "+c);
			a=b;
			b=c;
		}
	}

}
