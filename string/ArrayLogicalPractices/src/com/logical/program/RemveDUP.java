package com.logical.program;

import java.util.Arrays;

public class RemveDUP {
	public static void main(String[] args) {
		int[] ArrayNum= {10,20,30,10,20};
		System.out.println("Original Array :::");
		for(Integer element:ArrayNum) {
			System.out.println(element);
		}
		int[] Arraynum1=Arrays.stream(ArrayNum).distinct().toArray();
		
		System.out.println("After short:::");
		for(Integer element:Arraynum1) {
			System.out.println(element);
		}
	}

}
