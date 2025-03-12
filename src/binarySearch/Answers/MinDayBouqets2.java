package binarySearch.Answers;

public class MinDayBouqets2 {
	public static void main(String[] args) {
		int [] arr = {3,10,1,10,2};
		printArray(arr);
		System.out.println(minDays(arr, 2, 3));
	}

	public static int minDays(int[] arr, int bouqe, int flowers) {
		int n = arr.length;

		if (n < bouqe*flowers) {
			return -1;
		}

		int minDays = Integer.MAX_VALUE;
		int maxDays = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			minDays = Math.min(minDays, arr[i]);
			maxDays = Math.max(maxDays, arr[i]);
		}
		
		int i = minDays;
		int j = maxDays;
		int m = (i+j)/2;
		
		while (i <= j) {
			
			boolean b = isPossible(arr, m, bouqe, flowers);
			
			if (b) {
				j = m-1;
			}
			else {
				i = m+1;
			}
			m = (i+j)/2;
		}
		
		return i;   
	}
	
	public static boolean isPossible(int [] arr, int days, int bouqe, int flowers ) {
		
		int cnt = 0;
		int noOfBouque = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] <= days) {
				cnt++;
			}
			else {
				noOfBouque += (cnt/flowers);
				cnt = 0;
			}
		}
		noOfBouque += cnt/flowers;

		return noOfBouque>=bouqe;

	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
