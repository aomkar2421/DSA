package binarySearch.Answers;

public class MinDayBouqets {
	public static void main(String[] args) {
		int [] arr = {7,7,7,7,12,7,7};
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

		for (int i = minDays; i <= maxDays; i++) {
			Boolean ans = isPossible(arr, i, bouqe, flowers);
			if (ans) return i;
		}
		
		return -1;   
	}
	
	public static boolean isPossible(int [] arr, int days, int bouqe, int flowers ) {
		
		int cnt = 0;
		int noOfBouque = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] <= days) {
				cnt++;
			}
			else {
				noOfBouque += cnt/flowers;
				cnt = 0;
			}
		}
		noOfBouque += cnt/flowers;

		if (noOfBouque >= bouqe) return true;
		else return false;

	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
