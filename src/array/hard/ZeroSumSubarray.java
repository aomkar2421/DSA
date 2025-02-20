package array.hard;

import java.util.HashMap;

public class ZeroSumSubarray {
	public static void main(String[] args) {
		int [] arr = {15, -2, 2, -8, 1, 7, 10, 23};
		printArray(arr);
		System.out.println(maxLen(arr));
	}

	static int maxLen(int arr[]) {

		int max = 0;
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

		int sum = 0;

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
		if(max < 0){
			max = 0;
		}
		return max;
	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
