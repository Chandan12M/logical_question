package com.serach;
// need to check logc

public class BinarySearch {

	public static void main(String[] args) {
		int[] a={10,20,45,30,40,50};
		int key=30;
		binarySearch(a, key);

	}

	private static void binarySearch(int[] a, int key) {
		int first=0;
		int last=a.length-1;
		int mid=(first+last)/2;
		while(first<=last){
			if(a[mid]<key){
				first=mid+1;
			}
			else if(a[mid]==key){
				System.out.println("element found in index: "+mid);
				break;
			}else{
				last=mid-1;
				mid=(last+first)/2;
			}
		}
		if(first>last){
			System.out.println("element not found");
		}
		
	}

}
