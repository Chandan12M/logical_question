package logicalQuestion.pattern.number;

public class Pattern4 {

	public static void main(String[] args) {
		int row=5;
		int num=1;
		for(int i=num;i<=row;i++){
			for(int j=row;j>=i;j--){
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
