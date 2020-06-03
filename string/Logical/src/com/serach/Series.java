package com.serach;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Series {
	public static void main(String[] args) {
	System.out.print("Enter the limit of series ");
	
	 java.io.InputStreamReader  fis = new InputStreamReader(System.in);
	 
	 java.io.BufferedReader br = new BufferedReader(fis);
	 
	 int lim = Integer.parseInt(br.readLine());
	 
	 for(int i=1; i<=lim; i++);
	 {
	
		for(int j=1; j<=i; j++);
		{
	
	System.out.print(j);
	
	System.out.println();
	 
		 
			}

	 	}
	}
