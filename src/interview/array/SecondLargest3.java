package interview.array;

import java.util.Arrays;

public class SecondLargest3 {
	public static void main(String[] args) {
		int [] arr = {12, 35, 1, 10, 34, 1};
		printArray(arr);
		System.out.println(solution(arr));
	}

	private static int solution(int[] arr) {

		int largest = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				second = largest;
				largest = arr[i];
			}
			else if (arr[i] > second && arr[i] != largest) {
				second = arr[i];
			}
		}
		
		return second;
	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
