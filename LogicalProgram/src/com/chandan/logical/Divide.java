package com.chandan.logical;

import java.util.Scanner;

public class Divide {
	// divide a input 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("inter a value a");
		int a=sc.nextInt();
		System.out.println("inter a value b");
		int b=sc.nextInt();
		int count=0;
		for(int i=a;i<=b;i++) {
			if(i%10==0 || i%15==0) {
				count++;
			}
		}
		System.out.println(count);
	}

}
