package array.easy;

public class MoveZeroEnd {
	public static void main(String[] args) {
		int [] arr = {0,1,0,3,12,0,0,21};
		printArray(arr);
		solution(arr);
		printArray(arr);
	}

	private static void solution(int[] arr) {
		int i = 0;
		
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] != 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
			}
		}
		
	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
