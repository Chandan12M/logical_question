package com.logical.program;

import java.util.HashSet;
import java.util.Set;

public class ArrayDuplicate2 {
	public static void main(String[] args) {
		int[] ArrayDuplicate= {10,20,10,30,40,50,50};
		
		Set<Integer>set=new HashSet<>();
		for(Integer num:ArrayDuplicate) {
			if(!set.add(num))
			System.out.println(num);
		}
	}

}
