package interview.array.sub;

public class MaxProductSubarray {
	public static void main(String[] args) {
		int [] arr = {-2,6,-3,-10,0,2};
		printArray(arr);
		System.out.println(solution(arr));
	}

	private static int solution(int[] arr) {

		int n = arr.length;
		
		int prefix = 1;
		int suffix = 1;
		int maxPro = Integer.MIN_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			prefix *= arr[i];
			suffix *= arr[n-i-1];
			
			maxPro = Math.max(maxPro, Math.max(suffix, prefix));
			
			if (suffix == 0) suffix = 1;
			if (prefix == 0) prefix = 1;
			
		}
		
		return maxPro;
	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
