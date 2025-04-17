package interview.array.sub;

import java.util.ArrayList;

public class KadanePrintMaximumSubarraySum {
	public static void main(String[] args) {
		int [] arr = {-2,1,-1,4,-1,2,1,-5,4};
		printArray(arr);
		System.out.println(solution(arr));
	}

	private static ArrayList<Integer> solution(int[] arr) {

		int sum = 0;
		int maxSum = Integer.MIN_VALUE;
		int currStart = 0, resStart = 0, resEnd = 0;
		
		for (int i = 0; i < arr.length; i++) {
//	         here is one trick if you want to get longest subarray then change if (sum + arr[i] > arr[i]) to if (sum + arr[i] >= arr[i]), 
//	         bcz by including 0 we can obtain long subarray as in this case 1, -1 also gets included
			if (sum + arr[i] > arr[i]) {
				sum += arr[i];
			}
			else {
				sum = arr[i];
				currStart = i;
			}
			
			if (maxSum < sum) {
				maxSum = sum;
				resStart = currStart;
				resEnd = i;
			}
		}
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = resStart; i <= resEnd; i++) {
			al.add(arr[i]);
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
