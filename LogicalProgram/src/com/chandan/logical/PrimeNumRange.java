package com.chandan.logical;

import java.util.Scanner;

public class PrimeNumRange {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for (int i = 2; i < num; i++) {
			System.out.println("a");
			boolean flag = true;
			for (int j = 2; j < i; j++) {
				System.out.println("b");
				if (i % j == 0) {
					flag= false;
					break;
				}
			}
			if (flag)
				System.out.println(i + "");
		}

	}
}
