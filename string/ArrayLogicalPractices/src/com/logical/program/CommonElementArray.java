package com.logical.program;

public class CommonElementArray {
	public static void main(String[] args) {
		int[] Arraynum1= {10,20,30,400,560};
		int[]Arraynum2= {10,30,20,40,50};
		
		for(int i=0;i<Arraynum1.length;i++) {
			for(int j=0;j<Arraynum2.length;j++) {
				if(Arraynum1[i]==Arraynum2[i]) {
					System.out.println(Arraynum1[i]);
				}
			}
		}
	}

}
