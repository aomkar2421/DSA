package interview.array.sub;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class PrintLongestSubarrayWithGivenSumNegativesHashing {
	public static void main(String[] args) {
		int [] arr = {0,0,1,4,1,1,1,1,1};
		printArray(arr);
		System.out.println(solution(arr, 5));
	}

	private static ArrayList<Integer> solution(int[] arr, int k) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		hm.put(0, -1);
		int start = 0, sum = 0, maxLen = 0;
		
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];

			int val = sum - k;

			if (hm.containsKey(val)) {
				int len = i - hm.get(val) + 1;
				if (len > maxLen) {
					maxLen = len;
					al.clear();
					al.addAll(Arrays.asList(hm.get(val)+1, i));
				}
			}

			if (!hm.containsKey(sum)) {
				hm.put(sum, i);
			}
		}

		if (al.isEmpty()) {
			al.add(-1);
			return al;
		}

		return al;
	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
