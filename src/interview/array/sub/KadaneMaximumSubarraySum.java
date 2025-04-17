package interview.array.sub;

public class KadaneMaximumSubarraySum {
	public static void main(String[] args) {
		int [] arr = {-2,1,-1,4,-1,2,1,-5,4};
		printArray(arr);
		System.out.println(solution(arr));
	}

	private static int solution(int[] arr) {

		int sum = 0;
		int maxSum = Integer.MIN_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			if (sum + arr[i] > arr[i]) {
				sum += arr[i];
			}
			else {
				sum = arr[i];
			}
			
			maxSum = Math.max(sum, maxSum);
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
