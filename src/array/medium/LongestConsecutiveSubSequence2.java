package array.medium;

import java.util.Arrays;

public class LongestConsecutiveSubSequence2 {
	public static void main(String[] args) {
		int [] arr = {99, 100, 200, 1, 3, 2, 4, 22, 24, 23, 26, 25, 25, 25};
		printArray(arr);
		System.out.println(consequtiveSequence(arr));
	}

	private static int consequtiveSequence(int[] arr) {

		int len = 0;
		int maxLen = 0;
		int lastSmaller = Integer.MIN_VALUE;
		
		Arrays.sort(arr);

		for (int i = 0; i < arr.length-1; i++) {
			if(arr[i]-1 == lastSmaller) {
				len++;
				lastSmaller = arr[i];
			}else if (arr[i] != lastSmaller) {
				len = 1;
				lastSmaller = arr[i];
			}
			maxLen = Math.max(len, maxLen);
		}
		
		return maxLen;
	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
