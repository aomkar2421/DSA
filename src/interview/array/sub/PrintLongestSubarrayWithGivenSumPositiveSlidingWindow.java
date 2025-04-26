package interview.array.sub;

import java.util.ArrayList;
import java.util.Arrays;

public class PrintLongestSubarrayWithGivenSumPositiveSlidingWindow {
	public static void main(String[] args) {
		int [] arr = {15, 2, 4, 8, 7, 2, 5, 10, 23};
		printArray(arr);
		System.out.println(solution(arr, 17));
	}

	private static ArrayList<Integer> solution(int[] arr, int k) {

		int sum = 0, start = 0, maxLen = 0;
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			
			while (sum > k) {
				sum -= arr[start];
				start++;
			}
			
			if (sum == k) {
				int len = i - start + 1;
				if (len > maxLen) {
					maxLen = len;
					al.clear();
					al.addAll(Arrays.asList(start, i)); // storing 0 based indexes to store 1 based add +1
				}
			}
		}
		
		if (al.isEmpty()) {
			al.add(-1);
			return al;
		}
		return al;
	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
