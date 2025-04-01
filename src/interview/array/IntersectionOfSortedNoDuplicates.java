package interview.array;

import java.util.ArrayList;

public class IntersectionOfSortedNoDuplicates {
	public static void main(String[] args) {
		int [] arr1 = {1,2,3,4};
		int [] arr2 = {2,4,5};
		printArray(arr1);
		printArray(arr2);
		solution(arr1, arr2);
	}
	
	private static void solution(int[] arr1, int[] arr2) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		
		int n = arr1.length;
		int m = arr2.length;
		
		int i = 0, j = 0;
		
		while (i < n && j < m) {
			
			if (arr1[i] < arr2[j]) {
				i++;
			}
			else if (arr2[j] < arr1[i]) {
				j++;
			}
			else {
				al.add(arr1[i]);
				i++;
				j++;
			}
		}
		
		System.out.println(al);
	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
}
