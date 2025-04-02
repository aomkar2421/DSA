package interview.array;

import java.util.Arrays;

public class MinDiffernce {
	public static void main(String[] args) {
		int [] arr = {2, 4, 5, 9, 7};
		printArray(arr);
		System.out.println(solution(arr));
	}

	private static int solution(int[] arr) {

		Arrays.sort(arr);
		
		int minDif = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length-1; i++) {
			int dif = arr[i+1]-arr[i];
			minDif = Math.min(minDif, dif);
		}
		
		return minDif;
	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
