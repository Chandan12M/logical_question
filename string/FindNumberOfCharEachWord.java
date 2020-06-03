package logicalQuestion.string;
public class FindNumberOfCharEachWord{
	public static void main(String[] args) {
		String s="my name is sonu";
		/*String[] words=s.split("\\s");
		for(String word: words){
			char[] ch=word.toCharArray();
			int length=ch.length;
			System.out.println(word+" came "+length+" times");
		}*/
		String str="";
		int count=0;
		for (int i=0; i<s.length(); i++) {
			if(s.charAt(i)==' '){
				System.out.println(str+".."+str.length());
				str="";
				count=0;
			}
			else{
				count++;
				str=str+s.charAt(i);
			}
		}
	}
}