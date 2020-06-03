package logicalQuestion.pattern.number;

public class Pattern6 {

	public static void main(String[] args) {
		int row=5;
		int num=0;
		for(int i=num;i<row;i++){
			for(int j=1;j<=row-i;j++){
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
