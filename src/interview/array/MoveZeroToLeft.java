package interview.array;

public class MoveZeroToLeft {
	public static void main(String[] args) {
		int [] arr = {1, 2, 0, 4, 3, 0, 5, 0};
		printArray(arr);
		System.out.println(solution(arr));
	}

	private static int solution(int[] arr) {

		int j = arr.length-1;
		for (int i = arr.length-1; i >= 0; i--) {
			if (arr[i] != 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j--;
			}
		}
		printArray(arr);
		return -1;
	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
