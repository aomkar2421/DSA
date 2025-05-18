package interview.array.sub;

import java.util.HashMap;

public class ZeroSumSubarray {
	public static void main(String[] args) {
		int [] arr = {-31, -48, -90, 54, 20, 95, 6, -86, 22};
		printArray(arr);
		System.out.println(solution(arr));
	}

	private static int solution(int[] arr) {

		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		hm.put(0, -1); // add this or if (sum == 0) block
		int sum = 0;
		int maxLen = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			
//            if (sum == 0) {
//                maxLen = i + 1;
//            }
			
			if (hm.containsKey(sum)) {
				int len = i - hm.get(sum);
				if (maxLen < len) {
					maxLen = len;
				}
			}
			
			if (!hm.containsKey(sum)) {
				hm.put(sum, i);
			}
			
		}
		return maxLen;
	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
