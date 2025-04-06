package interview.array;

import java.util.Arrays;

public class SecondLargest {
	public static void main(String[] args) {
		int [] arr = {12, 35, 1, 10, 34, 1};
		printArray(arr);
		System.out.println(solution(arr));
	}

	private static int solution(int[] arr) {

		Arrays.sort(arr);
		
		return arr[arr.length-2];
	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
