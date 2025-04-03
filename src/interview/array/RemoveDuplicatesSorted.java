package interview.array;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicatesSorted {
	public static void main(String[] args) {
		int [] arr = {7,9,2,5,3,4,1,2,6,7,8,9};
		printArray(arr);
		System.out.println(solution(arr));
	}

	private static int solution(int[] arr) {

		
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
		int j = 0;
		for (int i = 0; i < arr.length-1; i++) {
			lhs.add(arr[i]);
		}
		
		System.out.println(lhs);
		
		return j;
	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
