package interview.search;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Practise {
	public static void main(String[] args) {
		int [] arr = {7, 10, 4, 3, 20, 15};
		printArray(arr);
		System.out.println(solution(arr, 1));
		Arrays.sort(arr);
		printArray(arr);
	}

	private static int solution(int[] arr, int k) {

		PriorityQueue<Integer> pq = new PriorityQueue<Integer>( (a,b) -> b-a );
		
		for (int i = 0; i < arr.length; i++) {
			pq.add(arr[i]);
			System.out.println(pq);
			System.out.println(pq.peek());
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
