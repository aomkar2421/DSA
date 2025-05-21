package interview.array;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class SlidingWindowMaximum2 {
	public static void main(String[] args) {
		int [] arr = {1, 2, 3, 1, 4, 5, 2, 3, 6};
		printArray(arr);
		System.out.println(solution(arr, 3));
	}

	private static ArrayList<Integer> solution(int[] arr, int k) {

		int n = arr.length;
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		int max = arr[0];
		for (int i = 0; i < 3; i++) {
			max = Math.max(max, arr[i]);
		}
		Deque<Integer> dq = new ArrayDeque<Integer>();
		
		for (int i = 3; i <= n-k; i++) {
			
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
