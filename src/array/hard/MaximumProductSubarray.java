package array.hard;

public class MaximumProductSubarray {
	public static void main(String[] args) {
		int [] arr = {-1,-2,-3,0};
		printArray(arr);
		System.out.println(maxProduct(arr));
	}

	public static int maxProduct(int[] arr) {
		
		int n = arr.length;
		
		int prefix = 1;
		int suffix = 1;
		int maxProduct = Integer.MIN_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			prefix = prefix * arr[i];
			suffix = suffix * arr[n-i-1];
			
			maxProduct = Math.max(maxProduct, Math.max(suffix, prefix));
			
			if (prefix == 0) {
				prefix = 1;
			}
			
			if (suffix == 0) {
				suffix = 1;
			}
			
		}
		return maxProduct;
	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
