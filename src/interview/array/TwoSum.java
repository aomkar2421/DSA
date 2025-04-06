package interview.array;

import java.util.HashSet;

public class TwoSum {
	public static void main(String[] args) {
		int [] arr = {1, 4, 45, 6, 10, 8};
		printArray(arr);
		System.out.println(solution(arr, 16));
	}

	private static boolean solution(int[] arr, int target) {

		HashSet<Integer> hs = new HashSet<Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			int num = target - arr[i];
			if (hs.contains(num)) {
				return true;
			}
			hs.add(arr[i]);
		}
		
		return false;
	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
