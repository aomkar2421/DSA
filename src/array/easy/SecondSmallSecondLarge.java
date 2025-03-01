package array.easy;

import java.util.ArrayList;
import java.util.Arrays;

public class SecondSmallSecondLarge {
	public static void main(String[] args) {
		int [] arr = {12, 35, 1, 10, 34, 2};
		printArray(arr);
		solve(arr);
	}
	
	static ArrayList<Integer> solve(int [] arr) {
		int small = Integer.MAX_VALUE, secondSmall = Integer.MAX_VALUE;
		int large = Integer.MIN_VALUE, secondLarge = Integer.MIN_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i] < small) {
				secondSmall = small;
				small = arr[i];
			}
			else if (arr[i] < secondSmall && arr[i] != small) {
				secondSmall = arr[i];
			}
			
			
			if (arr[i] > large) {
				secondLarge = large;
				large = arr[i];
			}
			else if (arr[i] > secondLarge && arr[i] != large) {
				secondLarge = arr[i];
			}
			
		}
		
		ArrayList<Integer> aList = new ArrayList<Integer>();
		aList.addAll(Arrays.asList(secondSmall, secondLarge));
		return aList;
	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
