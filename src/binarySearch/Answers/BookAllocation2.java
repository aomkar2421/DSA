package binarySearch.Answers;

import java.util.Arrays;

public class BookAllocation2 {
	public static void main(String[] args) {
		int [] arr = {15, 10, 19, 10, 5, 18, 7};
		printArray(arr);
		System.out.println(findPages(arr, 5));
	}
	
    public static int findPages(int[] arr, int k) {
    	
    	int n = arr.length;
    	
    	if (n < k) {
			return -1;
		}
    	
    	int sum = 0;
    	int max = Integer.MIN_VALUE;
    	for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			max = Math.max(max, arr[i]);
		}
    	
    	for (int i = max; i <= sum; i++) {
    		
    		boolean ans = isPossible(arr, k, i);
    		if (ans) {
				return i;
			}
		}
    	
        return -1;
    }
    
    

	private static boolean isPossible(int[] arr, int k, int i) {
		int studentCnt = 1;
		int pages = 0;
		
		for (int j = 0; j < arr.length; j++) {
			if (pages + arr[j] <= i) {
				pages += arr[j];
			}
			else {
				studentCnt++;
				pages = arr[j];
			}
		}
		
		if (studentCnt <= k) {
			return true;
		}
		
		return false;
	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
