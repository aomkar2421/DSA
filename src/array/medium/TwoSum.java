package array.medium;

import java.util.HashMap;

public class TwoSum {
	public static void main(String[] args) {
		int [] arr = {2,7,11,15};
		printArray(arr);
		twoSum(arr, 9);
	}
	
	public static int[] twoSum(int[] arr, int target) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			
			if (hm.containsKey(target-arr[i])) {
				int j = hm.get(target-arr[i]);
				return new int [] {i, j};
			}
			
			hm.put(arr[i], i);
			
		}
		
        return new int [] {};
    }

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
