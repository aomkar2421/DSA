package interview.array;

public class NextPermutation {
	public static void main(String[] args) {
		int [] arr = {2,1,5,4,3,0,0};
		printArray(arr);
		solution(arr);
		printArray(arr);
	}

	private static void solution(int[] arr) {

		int n = arr.length;
		int i;
		for (i = n-2; i >= 0; i--) {
			if (arr[i] < arr[i+1]) {
				break;
			}
		}
		
		if (i == -1) {
			rev(arr, 0, n-1);
			return;
		}
		
		int idx = i;
		for (int j = n-1; j >= 0; j--) {
			if (arr[j] > arr[idx]) {
				int temp = arr[idx];
				arr[idx] = arr[j];
				arr[j] = temp;
				break;
			}
		}

		rev(arr, idx+1, n-1);
		
	}

	private static void rev(int[] arr, int i, int j) {
		while (i <= j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
