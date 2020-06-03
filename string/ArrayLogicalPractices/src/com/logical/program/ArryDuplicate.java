package com.logical.program;

import java.util.HashSet;
import java.util.Set;

public class ArryDuplicate {
	public static void main(String[] args) {
		int[] ArrayDup= {10,20,50,10,20,50};
		/*
		 * for(int i=0;i<ArrayDup.length;i++) { for(int j=i+1;j<ArrayDup.length;j++) {
		 * if(ArrayDup[i]==ArrayDup[j]) { System.out.print(ArrayDup[j]+" "); } } }
		 */
		Set<Integer>set=new HashSet<>();
		for(Integer num:ArrayDup) {
			if(!set.add(num)) {
		System.out.print(num+" ");
		}
	

}
}
}
