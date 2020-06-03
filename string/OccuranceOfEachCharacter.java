package logicalQuestion.string;

import java.util.Arrays;

public class OccuranceOfEachCharacter {

	public static void main(String[] args) {
		String s="my name is sonunigam bar";
		char[] ch=s.toCharArray();
		Arrays.sort(ch);
		for(int i=0;i<ch.length;i++){
			int count=1;
			for(int j=i;j<ch.length;j++){
				if(ch[i]==ch[j]){
					count=count+1;
					ch[i]=ch[j];
				}
			}
			System.out.println(ch[i]+"...."+count+" time");
		}

	}

}
