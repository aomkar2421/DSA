package array.medium;

import java.util.HashSet;

public class LongestConsecutiveSubSequence {
	public static void main(String[] args) {
		int [] arr = {99, 100, 200, 1, 3, 2, 22, 23, 26, 25, 25, 25};
		printArray(arr);
		System.out.println(consequtiveSequence(arr));
	}

	private static int consequtiveSequence(int[] arr) {

		int maxLen = 0;

		HashSet<Integer> hs = new HashSet<Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			hs.add(arr[i]);
		}
		
		for (int i = 0; i < arr.length; i++) {
			int len = 1;
			if (!hs.contains(arr[i] - 1)) {
				int val = arr[i];
				while (hs.contains(val+1)) {
					len++;
					val++;
				}
			}		
			if (len > maxLen) {
				maxLen = len;
			}
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
