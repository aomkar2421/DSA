package interview.array.sub;

import java.util.HashMap;

public class LongestSubarrayWithGivenXOR {
	public static void main(String[] args) {
		int [] arr = {4, 2, 2, 6, 4};
		printArray(arr);
		System.out.println(solution(arr, 6));
	}

	private static int solution(int[] arr, int k) {

		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		hm.put(0, 1);
		
		int xor = 0;
		int count = 0;
		
		for (int i = 0; i < arr.length; i++) {
			xor = xor^arr[i];
			
			int val = xor^k;
			
			if (hm.containsKey(val)) {
				count += hm.get(val);
			}
			
			hm.put(xor, hm.getOrDefault(xor, 0)+1);
			
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
