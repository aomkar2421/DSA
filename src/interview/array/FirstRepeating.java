package interview.array;

import java.util.HashMap;
import java.util.HashSet;

public class FirstRepeating {
	public static void main(String[] args) {
		int [] arr = {6, 10, 5, 4, 9, 120, 4, 6, 10};
		printArray(arr);
		System.out.println(solution(arr));
	}

	private static int solution(int[] arr) {

		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		
		int idx = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (hm.containsKey(arr[i])) {
				idx = Math.min(idx, hm.get(arr[i]));
			}
			hm.put(arr[i], i+1);
		}
		
		if (idx != Integer.MAX_VALUE) {
			return idx;
		}
		return -1;
	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
