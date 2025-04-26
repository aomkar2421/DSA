package interview.array;

import java.util.ArrayList;

public class PrintMaximumSubarray {
	public static void main(String[] args) {
		int [] arr = {-2,1,-3,4,-1,2,1,-5,4};
		printArray(arr);
		System.out.println(solution(arr));
	}

	private static ArrayList<Integer> solution(int[] arr) {

		int start=0;
		int end=0;
		int currentStart = 0;
		int maxSum = Integer.MIN_VALUE;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			
			sum += arr[i];
			
			if (maxSum < sum) {
				maxSum = sum;
				start = currentStart;
				end = i;
			}
			
			if (sum < 0) {
				sum = 0;
				currentStart = i+1;
			}
			
		}
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int j = start; j <= end; j++) {
			al.add(arr[j]);
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
