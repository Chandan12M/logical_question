package logicalQuestion.number;

import java.util.Scanner;

public class PrimeNumBetweenTwoNumber {

	public static void main(String[] args) {
		int num=100;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter initial no:");
		int initialNo=sc.nextInt();
		for(int j=initialNo;j<=num;j++){
			int count=0;
			for(int k=1;k<=j;k++){
				if(j%k==0){
					count++;
				}
			}
			if(count==2){
				System.out.println(j+" ");
			}
		}

	}

}
