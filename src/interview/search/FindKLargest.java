package interview.search;

import java.util.Arrays;

public class FindKLargest {
	public static void main(String[] args) {
		int [] arr = {7, 10, 4, 3, 20, 15, 34, 1};
		printArray(arr);
		System.out.println(solution(arr, 8));
	}

	private static int solution(int[] arr, int k) {

		Arrays.sort(arr);
		printArray(arr);
		int n = arr.length;
		return arr[n-k];
	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
