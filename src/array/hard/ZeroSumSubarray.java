package array.hard;

import java.util.ArrayList;
import java.util.HashMap;

public class ZeroSumSubarray {
	public static void main(String[] args) {
		int [] arr = {1,-1,3,2,-2,-8,1,7,10,2,3};
		printArray(arr);
		System.out.println(maxLen(arr));
	}

	static int maxLen(int arr[]) {

		int max = Integer.MIN_VALUE;
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

		int sum = 0;
		hm.put(-1, 0);

		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
			if (sum == 0) {
				max = i + 1;
			}
			else if (hm.get(sum) != null) {
				int len = i - hm.get(sum) ;
				if (max < len) max = len;
			}else {
				hm.put(sum, i);
			}
		}
		return max;
	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
