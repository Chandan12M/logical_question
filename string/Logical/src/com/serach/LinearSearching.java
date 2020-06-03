package com.serach;

public class LinearSearching {

	public static void main(String[] args) {
		int[] a={30,50,10,40,20};
		int num=40,i;
		boolean count=false;
		for(i=0;i<a.length;i++){
			if(a[i]==num){
				count=true;
				break;
			}
		}
		if(count){
			System.out.println("element found at position: "+i);
		}
			
	}
}
