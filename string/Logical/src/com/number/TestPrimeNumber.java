package com.number;

import java.util.Scanner;

public class TestPrimeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int factor=1;
		int num=sc.nextInt();
		for(int i=2;i<=num;i++){
			if(num%i==0){
				factor=factor+1;
			}
		}
		if(factor==2){
			System.out.println(num+" is prime number");
		}
		else if(factor==1 || factor==0){
			System.out.println("plz enter valid no");
		}else{
			System.out.println(num+" is not prime number");
		}
		

	}

}
