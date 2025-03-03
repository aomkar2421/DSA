package array.easy;

public class MaxSubarraySumPositives {
	public static void main(String[] args) {
		int [] arr = {2, 3, -8, 7, -7, 2, 3};
		printArray(arr);
		System.out.println(solution(arr));
	}

	private static int solution(int[] arr) {
		int sum = 0;
		int maxSum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
			if (sum < 0) {
				sum = 0;
			}
			if (maxSum < sum) {
				maxSum = sum;
			}
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
