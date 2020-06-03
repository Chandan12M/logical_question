package logicalQuestion.string;

public class Palindrome {
//reverse the element of an array also same logic
	public static void main(String[] args) {
		String s="kanak";
	
		char[] ch=s.toCharArray();
		String nstr="";
		for(int i=0;i<ch.length/2;i++){
			char temp=ch[i];
			ch[i]=ch[ch.length-1-i];
			ch[ch.length-1-i]=temp;
		}
		nstr=new String(ch);
		if(nstr.equalsIgnoreCase(s)){
			System.out.println("palindrom");
		}else{
			System.out.println("not palindrome");
		}
		

		/*String nstr="";
		for(int i=s.length()-1;i>=0;i--){
			nstr=nstr+s.charAt(i);
		}
		if(s.equalsIgnoreCase(nstr)){
			System.out.println("palindrom");
		}else{
			System.out.println("not palindrome");
		}*/
	}

}
