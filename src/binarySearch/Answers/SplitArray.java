package binarySearch.Answers;

import java.util.Arrays;

public class SplitArray {
	public static void main(String[] args) {
		int [] arr = {7,2,5,10,8};
		printArray(arr);
		System.out.println(splitArray(arr, 2));
	}
	
    public static int splitArray(int[] arr, int k) {
    	
    	int n = arr.length;
    	if (n < k) return -1;
    	
    	int min = Arrays.stream(arr).max().getAsInt();
    	int max = Arrays.stream(arr).sum();
    	
    	for (int i = min; i <= max; i++) {
			
    		boolean ans = isPossible(arr, k, i);
    		if (ans) {
				return i;
			}
		}
    	
		return -1;     
    }

	private static boolean isPossible(int[] arr, int k, int maxSum) {
		
		int sum = 0;
		int cnt = 1;
		
		for (int i = 0; i < arr.length; i++) {
			if (sum + arr[i] <= maxSum) {
				sum += arr[i];
			}
			else {
				cnt++;
				sum = arr[i];
			}
		}
		
		if (cnt <= k) return true;
		
		return false;
	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
