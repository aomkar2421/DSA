package array.easy;

import java.util.HashMap;

public class LongestSubarraySumPositive {
	public static void main(String[] args) {
		int [] arr = {3, 1, 2, 3, 1, 1, 1, 1, 3, 3, 2, 1,1,1,1,1};
		printArray(arr);
		int k = 6;
		System.out.println(longestSubarray(arr, k));
	}
	
    public static int longestSubarray(int[] arr, int k) {
    	    	
    	int sum = 0;
    	int maxLen = 0;
    	int right = 0, left = 0;
    	
    	while (right < arr.length) {
			sum = sum + arr[right];
			
			if (sum == k) {
				int len = right - left + 1;
				maxLen = Math.max(maxLen, len);
			}
			
			while (left <= right &&  sum > k) {
				sum = sum - arr[left];
				left++;
			}
			
			if (sum == k) {
				int len = right - left + 1;
				maxLen = Math.max(maxLen, len);
			}
			
			right++;
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
