package logicalQuestion.pattern.star;

public class StarPattern1 {
	public static void main(String[] args) {
		int num=1;
		int row=5;
		for(int i=num;i<=row;i++){
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
