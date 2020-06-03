package logicalQuestion.pattern.number;

public class Pattern3 {

	public static void main(String[] args) {
		int row=5;
		int k=1;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=i;j++){
				System.out.print(k);
				k++;
			}
			System.out.println();
		}

	}

}
