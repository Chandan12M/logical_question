package logicalQuestion.string;

class ArraySort{

	public static void main(String[] args) {
        String s="hello";
        char[] a=s.toCharArray();	

        for (int round = 1; round <= a.length-1; round++) 
        {
            for (int i=0; i<=a.length-i; i++) {
                if(a[i]>a[i+1]){
                    char temp=a[i];
                    a[i]=a[i+1];
                    a[i+1]=temp;
                }
            }
        }
        for (int i=0; i<a.length; i++) {
            System.out.println(a[i]);
        }
//-------------------------------------------------------------------------------
	}
}
