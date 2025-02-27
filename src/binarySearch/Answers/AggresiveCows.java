package binarySearch.Answers;

import java.util.Arrays;

public class AggresiveCows {
	public static void main(String[] args) {
		int [] arr = {1,5,17};
		printArray(arr);
		System.out.println(aggressiveCows(arr, 2));
	}

	public static int aggressiveCows(int[] arr, int k) {
		
		Arrays.sort(arr);
		int n = arr.length;
		
		int min = arr[0], max = arr[n-1];
		
		for (int i = 1; i <= max-min; i++) {
			int cowCount = 1;
			int lastCow = arr[0];
			for (int j = 1; j < arr.length; j++) {
				if (arr[j] - lastCow >= i) {
					cowCount++;
					lastCow = arr[j];
				}
			}
			if (cowCount < k) {
				return i-1;
			}
		}
		
		return max-min;
	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
