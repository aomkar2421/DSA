package array.easy;

public class Kadane {
	public static void main(String[] args) {
		int [] arr = {-2, -4, 10, 4, -99, 99, 20, 0, -199, 2, 3, 4, 5, 299};
		printArray(arr);
		System.out.println(solution(arr));
	}

	private static int solution(int[] arr) {
		int sum = 0;
		int maxSum = Integer.MIN_VALUE;
		int start = 0;
		int ansStart = -1;
		int ansEnd = -1;
		
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
			
			if (maxSum < sum) {
				maxSum = sum;
				ansStart = start;
				ansEnd = i;
			}
			
			if (sum < 0) {
				sum = 0;
				start = i+1;
			}
		}
		System.out.println(ansStart+" "+ansEnd);
		
		return maxSum;
	}
	
	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}	
