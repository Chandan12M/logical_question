package com.number;

import java.util.Scanner;

public class MultipleMultiplicationTable {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter multiplication table from:");
		int from=sc.nextInt();
		System.out.println("enter multiplication table to:");
		int to=sc.nextInt();
		for(int i=from;i<=to;i++){
			for(int j=1;j<=10;j++){
				System.out.println(i+"*"+j+"="+(i*j));
			}
		}

	}

}
