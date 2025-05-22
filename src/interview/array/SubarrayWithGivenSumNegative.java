package interview.array;

import java.util.ArrayList;
import java.util.HashMap;

public class SubarrayWithGivenSumNegative {
	public static void main(String[] args) {
		int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		printArray(arr);
		System.out.println(solution(arr, 15));
	}

	private static ArrayList<Integer> solution(int[] arr, int k) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		hm.put(0, -1);
		int sum = 0;
		int start = -1;
		int end = -1;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			hm.put(sum, i);
			
			int num = sum - k;
			if (hm.containsKey(num)) {
				start = hm.get(num)+1;
				end = i;
				break;
			}
			
		}
		
		for (int i = start; i <= end; i++) {
			al.add(arr[i]);
		}
		
		if (al.isEmpty()) {
			al.add(-1);
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
