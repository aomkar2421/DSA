package interview.search;

import java.util.Arrays;
import java.util.PriorityQueue;

public class FindKLargest2 {
	public static void main(String[] args) {
		int [] arr = {7, 10, 4, 3, 20, 15};
		printArray(arr);
		System.out.println(solution(arr, 1));
		Arrays.sort(arr);
		printArray(arr);
	}

	private static int solution(int[] arr, int k) {
		
		if (k > arr.length) {
			return -1;
		}

		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			pq.add(arr[i]);
			
			if (pq.size() > k) {
				pq.poll();
			}
		}
		
		return pq.peek();
	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
