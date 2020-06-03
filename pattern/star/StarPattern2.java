package logicalQuestion.pattern.star;

public class StarPattern2 {
	public static void main(String[] args) {
		int num=1;
		int row=5;
		for(int i=1;i<=row;i++){
			for(int j=row;j>=1;j--){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
