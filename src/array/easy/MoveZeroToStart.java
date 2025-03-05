package array.easy;

public class MoveZeroToStart {
	public static void main(String[] args) {
		int [] arr = {0,1,0,3,12,0,0,21};
		printArray(arr);
		solution(arr);
		printArray(arr);
	}

	private static void solution(int[] arr) {
		int i = arr.length-1;
		
		for (int j = arr.length-1; j >= 0; j--) {
			if (arr[j] != 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i--;
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
