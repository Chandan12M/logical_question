package logicalQuestion.string;

public class ReverseFullString {

	public static void main(String[] args) {
		String s="my name is sonu";
		String str="";
		for(int i=s.length()-1;i>=0;i--){
			str=str+s.charAt(i);
		}
		System.out.println(str);

	}

}
