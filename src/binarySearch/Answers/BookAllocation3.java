package binarySearch.Answers;

import java.util.Arrays;

public class BookAllocation3 {
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
    	
    	int i = max;
    	int j = sum;
    	int m = (i+j)/2;
    	
    	while (i <= j) {
    		int stdCnt = isPossible(arr, k, m);
    		if (stdCnt <= k) {
				j = m-1;
			}else {
				i = m+1;
			}
    		m = (i+j)/2;
		}
    	
        return i;
    }

	private static int isPossible(int[] arr, int k, int pages) {
		int studentCnt = 1;
		int pagesCnt = 0;
		
		for (int j = 0; j < arr.length; j++) {
			if (pagesCnt + arr[j] <= pages) {
				pagesCnt += arr[j];
			}
			else {
				studentCnt++;
				pagesCnt = arr[j];
			}
		}
		
		return studentCnt;
	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
