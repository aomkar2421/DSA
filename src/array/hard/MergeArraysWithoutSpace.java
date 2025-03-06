package array.hard;

import java.util.Arrays;

public class MergeArraysWithoutSpace {
	public static void main(String[] args) {
		int [] arr1 = {5,6,7,8};
		int [] arr2 = {2,3,4};
		printArray(arr1);
		printArray(arr2);
		merge(arr1, arr1.length, arr2, arr2.length);
		printArray(arr1);
		printArray(arr2);
	}
	
    public static void merge(int[] arr1, int n, int[] arr2, int m) {
        int i = n-1;
        int j = 0;

        while ( i>=0 && j<=m-1) {
			if (arr1[i] > arr2[j]) {
				int temp = arr1[i];
				arr1[i] = arr2[j];
				arr2[j] = temp;
			}else {
				break;
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
