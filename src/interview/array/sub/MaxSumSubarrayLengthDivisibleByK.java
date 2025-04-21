package interview.array.sub;

public class MaxSumSubarrayLengthDivisibleByK {
	public static void main(String[] args) {
		int [] arr = {-1,-2,-3,-4,-5};
		printArray(arr);
		System.out.println(solution(arr, 4));
	}

	private static int solution(int[] arr, int k) {

        if (arr.length < k) return -1;
        
		int sum = 0;
		int maxSum = Integer.MIN_VALUE;
		int currStart = 0;

		int maxlength=0;
		
		for (int i = 0; i < arr.length; i++) {
			
			sum += arr[i];
			int len = i - currStart+1;
			System.out.println(arr[i]+" Sum : "+sum+" maxSum : "+maxSum+" i : "+i+" currStart : "+currStart+" len : "+len+" maxLen : "+maxlength);

			if (sum > maxSum && len > maxlength && len%k == 0 ) {
				maxSum = sum;
				maxlength = len;
			}
			
			if (sum < 0) {
				currStart = i+1;
				sum = 0;
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
