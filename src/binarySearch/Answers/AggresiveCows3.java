package binarySearch.Answers;

import java.util.Arrays;

public class AggresiveCows3 {
	public static void main(String[] args) {
		int [] arr = {1,5,17};
		printArray(arr);
		System.out.println(aggressiveCows(arr, 2));
	}

	public static int aggressiveCows(int[] arr, int k) {

		Arrays.sort(arr);

		int n = arr.length;

		int min = arr[0], max = arr[n-1];

		int i = 1;
		int j = max-min;
		int m = (i+j)/2;

		while (i <= j) {
			int count = canWePlace(arr, m, k);

			if (count >= k) {
				i = m+1;
			}
			else {
				j = m-1;
			}
			m = (i+j)/2;
		}

		return m;
	}

	public static int canWePlace(int[] arr, int i, int k) {

		int cowCount = 1;
		int lastCow = arr[0];

		for (int j = 1; j < arr.length; j++) {
			if (arr[j] - lastCow >= i) {
				cowCount++;
				lastCow = arr[j];
			}
			
		}

		return cowCount;
	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
