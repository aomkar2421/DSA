package interview.array;

public class RoatateLeftWithoutSpace {
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5};
		printArray(arr);
		solution(arr, 2);
	}

	private static void solution(int[] arr, int k) {

		int n = arr.length;
		
		reverse(arr, 0, k-1);
		reverse(arr, k, n-1);
		reverse(arr, 0, n-1);
		
		printArray(arr);
	}
	
	
	

	private static void reverse(int[] arr, int i, int j) {
		for (int k = i; k <= j; k++) {
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
