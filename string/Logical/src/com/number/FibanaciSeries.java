package com.number;

public class FibanaciSeries {

	public static void main(String[] args) {
		int num = 9;
		int n1 = 0;
		int n2 = 1;
		for (int i = 1; i <= num; i++) {
			System.out.print(n1 + " ");
			int sum = n1 + n2;
			n1 = n2;
			n2 = sum;
		}
	}

}
