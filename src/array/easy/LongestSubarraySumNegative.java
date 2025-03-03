package array.easy;

import java.util.HashMap;

public class LongestSubarraySumNegative {
	public static void main(String[] args) {
		int [] arr = {10, 5, 2, 7, 1, -10};
		printArray(arr);
		int k = 15;
		System.out.println(longestSubarray(arr, k));
	}
	
    public static int longestSubarray(int[] arr, int k) {
    	
    	HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
    	
    	int sum = 0;
    	int maxLen = 0;
    	
    	for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			
			if (sum == k) {
				maxLen = i+1;
			}
			
			int rem = sum - k;
			
			if (hm.containsKey(rem)) {
				int len = i - hm.get(rem);
				maxLen = Math.max(maxLen, len);
			}
			
			if (!hm.containsKey(sum)) {
				hm.put(sum, i);
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
