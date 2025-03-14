package binarySearch.Answers;

import java.util.Arrays;

public class SplitArray2 {
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
    	
    	int i = min;
    	int j = max;
    	int m = (i+j)/2;
    	
    	while (i <= j) {
			int cnt = isPossible(arr, max);
			
			if (cnt <= k) {
				j = m-1;
			}
			else {
				i = m+1;
			}
			m = (i+j)/2;
		}
    	
		return i;     
    }

	private static int isPossible(int[] arr, int maxSum) {
		
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
		
		return cnt;
	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
