package com.pattern.num;

/*12345
1234
123
12
1
*/
public class Pattern5 {

	public static void main(String[] args) {
		int row=5;
		int num=1;
		for(int i=num;i<=row;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j);
			}
			System.out.println();
		}
		for(int i=1;i<=row-1;i++){
			for(int j=1;j<=row-i;j++){
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
