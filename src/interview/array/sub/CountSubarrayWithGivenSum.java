package interview.array.sub;

import java.util.HashMap;

public class CountSubarrayWithGivenSum {
	public static void main(String[] args) {
		int [] arr = {10,2,-2,-20,10};
		printArray(arr);
		System.out.println(solution(arr, -10));
	}

	private static int solution(int[] arr, int k) {

		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		hm.put(0, 1);
		
		int count = 0;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			
			int val = sum - k;
			
			if (hm.containsKey(val)) {
				count += hm.get(val);
			}

			hm.put(sum, hm.getOrDefault(sum, 0)+1);
		}
		
		return count;
	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
