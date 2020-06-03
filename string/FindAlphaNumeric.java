package logicalQuestion.string;

public class FindAlphaNumeric {

	public static void main(String[] args) {
		String s="sonu123nigam";
		for(int i=0;i<s.length();i++){
			if((s.charAt(i)>=48) && (s.charAt(i)<=57)){
				System.out.print(s.charAt(i));
			}
		}
	}

}
