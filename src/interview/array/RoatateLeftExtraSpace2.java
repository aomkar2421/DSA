package interview.array;

public class RoatateLeftExtraSpace2 {
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,6,7,8};
		printArray(arr);
		solution(arr, 3);
	}

	private static void solution(int[] arr, int k) {

		int [] ans = new int [arr.length];
		int n = arr.length;
		
		int j = 0;
		for (int i = k; i < n; i++) {
			ans[j++] = arr[i];
		}
		
		for (int i = 0; i < k; i++) {
			ans[j++] = arr[i];
		}
		
		printArray(ans);
	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
