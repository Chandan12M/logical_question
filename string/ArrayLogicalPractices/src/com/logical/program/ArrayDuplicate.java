package com.logical.program;

public class ArrayDuplicate {
	public static void main(String[] args) {
		int[] ArrayDupNum= {5,4,6,8,8,80,10,20,10};
		
		for(int i=0;i<ArrayDupNum.length;i++) {
			for(int j=i+1;j<ArrayDupNum.length;j++) {
				if(ArrayDupNum[i]==ArrayDupNum[j]) {
					System.out.println(ArrayDupNum[i]);
				}
			}
			
				
		}
			}

}
