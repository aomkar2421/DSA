package interview.array.sub;

import java.util.HashMap;

public class MaxSumSubarraySizeK {
	public static void main(String[] args) {
		int [] arr = {10,20,30,90,110,100,30,40,50};
		printArray(arr);
		System.out.println(solution(arr, 3));
	}

	private static int solution(int[] arr, int k) {

        if (arr.length < k) {
            System.out.println("Invalid");
            return -1;
        }
        
		int sum = 0;
		for (int i = 0; i < k; i++) {
			sum += arr[i];
		}
		
		int maxSum = sum;
		for (int i = 3; i < arr.length; i++) {
			sum = (sum-arr[i-k])+arr[i];
			maxSum = Math.max(maxSum, sum);
		}
		
		return maxSum;
	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
