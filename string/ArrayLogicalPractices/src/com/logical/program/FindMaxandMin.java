package com.logical.program;

public class FindMaxandMin {
	public static void main(String[] args) {
		int[]arry= {10,20,30,100,99};
		
		int maxnum=arry[0];
		int minnum=arry[0];
		
		for(int i=0;i<arry.length;i++) {
			if(maxnum<arry[i]) {
				maxnum=arry[i];
			}else if
				(minnum>arry[i]){
				minnum=arry[i];
			}
		}
		System.out.println(maxnum+" "+minnum);
	}

}
