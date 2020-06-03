package com.pattern.num;

/*1
12
123
1234
12345
*/
public class Pattern8 {

	public static void main(String[] args) {
		int row=5;
		int num=1;
		for(int i=num;i<=row;i++){
			for(int j=1;j<=row-i;j++){
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++){
				System.out.print(k);
			}
			System.out.println();
		}

	}

}
