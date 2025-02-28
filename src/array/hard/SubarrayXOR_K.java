package array.hard;

import java.util.HashMap;

public class SubarrayXOR_K {
	public static void main(String[] args) {
		int [] arr = {4, 2, 2, 6, 4};
		printArray(arr);
		System.out.println(subarrayXor(arr, 6));
	}
	
	static long subarrayXor(int [] arr, int k) {
		HashMap<Long, Integer > hm = new HashMap<Long, Integer>();
//		hm.put((long) 0, 1);
		
		long sum = 0;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum ^ arr[i];
			
			if (sum == k) {
				count++;
			}
			
			long target = sum ^ k;
			
			if (hm.containsKey(target)) {
				count = count + hm.get(target);
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
