package interview.array.sub;

import java.util.ArrayList;

public class KadanePrintMaximumSubarraySum2 {
	public static void main(String[] args) {
		int[] arr = {-2, 1, -1, 4, -1, 2, 1, -5, 4};
		printArray(arr);
		System.out.println(solution(arr));
	}

	private static ArrayList<Integer> solution(int[] arr) {
		int sum = 0;
		int maxSum = Integer.MIN_VALUE;
		int currStart = 0, resStart = 0, resEnd = 0;

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];

			if (maxSum < sum) {
				maxSum = sum;
				resStart = currStart;
				resEnd = i;
			}

			//         here is one trick if you want to get longest subarray then change if(sum < 0) to if(sum <=0), 
			//         bcz by including 0 we can obtain long subarray as in this case 1, -1 also gets included
			if (sum < 0) { 
				sum = 0;
				currStart = i + 1;
			}
		}

		ArrayList<Integer> result = new ArrayList<>();
		for (int i = resStart; i <= resEnd; i++) {
			result.add(arr[i]);
		}

		return result;
	}

	private static void printArray(int[] arr) {
		for (int value : arr) {
			System.out.print(value + " ");
		}
		System.out.println();
	}
}