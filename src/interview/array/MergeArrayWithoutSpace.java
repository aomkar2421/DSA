package interview.array;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeArrayWithoutSpace {
	public static void main(String[] args) {
		int [] arr1 = {1,5,9,10,15,20};
		int [] arr2 = {2,3,8,13};
		printArray(arr1);
		printArray(arr2);
		solution(arr1, arr2);
	}
	
	private static void solution(int[] arr1, int[] arr2) {

		int i = arr1.length-1;
		int j = 0;
		
		while (i >= 0 && j < arr2.length) {
			
			if (arr1[i] > arr2[j]) {
				int temp = arr1[i];
				arr1[i] = arr2[j];
				arr2[j] = temp;
			}
			i--;
			j++;
		}
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
}
