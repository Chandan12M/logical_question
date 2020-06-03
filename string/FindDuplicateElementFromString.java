package logicalQuestion.string;

public class FindDuplicateElementFromString {
	public static void main(String[] args) {
		
		String s="my name is sonu";
		char[] ch=s.toCharArray();
		char[] nch=new char[ch.length];
		int count=0;
		for(int i=0;i<ch.length;i++){
			for(int j=i+1;j<ch.length;j++){
				if(ch[i]==ch[j]){
					nch[count]=ch[i];
					count++;
					break;
				}
			}
		}
		
		for(int i=0;i<nch.length;i++){
			System.out.print(nch[i]);
		}
	}
}
