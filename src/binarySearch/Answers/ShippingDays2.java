package binarySearch.Answers;

public class ShippingDays2 {
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,6,7,8,9,10};
		printArray(arr);
		System.out.println(shipWithinDays(arr, 5));
	}

	public static int shipWithinDays(int[] arr, int days) {

		int totalWeight = 0;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			totalWeight += arr[i];
			max = Math.max(max, arr[i]);
		}


		int i = max;
		int j = totalWeight;
		int m = (i+j)/2;
		int ans = -1;
		
		while (i <= j) {

			int requiredDays = findRequiredDays(arr, m);

			if (requiredDays <= days) {
				ans = m;
				j = m-1;
			}
			else {
				i = m + 1;
			}	

			m = (i+j)/2;
		}

		return ans;   
	}

	static int findRequiredDays(int [] arr, int i) {

		int requiredDays = 1;
		int load = 0;

		for (int j = 0; j < arr.length; j++) {
			if (load + arr[j] > i) {
				requiredDays++;
				load = arr[j];
			}
			else {
				load += arr[j];
			}
		}

		return requiredDays;
	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
