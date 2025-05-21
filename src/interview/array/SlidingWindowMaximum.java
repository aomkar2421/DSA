package interview.array;

import java.util.ArrayList;

public class SlidingWindowMaximum {
	public static void main(String[] args) {
		int [] arr = {1, 2, 3, 1, 4, 5, 2, 3, 6};
		printArray(arr);
		System.out.println(solution(arr, 3));
	}

	private static ArrayList<Integer> solution(int[] arr, int k) {

		int n = arr.length;
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for (int i = 0; i <= n-k; i++) {
			
			int max = arr[i];
			
			for (int j = i; j < k+i; j++) {
				max = Math.max(max, arr[j]);
			}
			al.add(max);
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
