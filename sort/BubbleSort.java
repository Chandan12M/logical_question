package logicalQuestion.sort;
//bubble sort is also swapping to number logic applied
public class BubbleSort {

	public static void main(String[] args) {
		int[] arr={10,50,30,40,20};
		sort(arr);
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}

	private static void sort(int[] arr) {
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<=arr.length-1;j++){
				if(arr[i]>arr[j]){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}

}
