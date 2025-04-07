package interview.array;

import java.util.ArrayList;

public class UnionOfSortedDuplicates {
	public static void main(String[] args) {
		int [] arr1 = {1,1,2,2,2,2,4};
		int [] arr2 = {2,3,4,4,5};
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
			if (i > 0 && arr1[i] == arr1[i-1]) {
				i++;
				continue;
			}
			
			if (j > 0 && arr2[j] == arr2[j-1]) {
				j++;
				continue;
			}
			
			if (arr1[i] < arr2[j]) {
				al.add(arr1[i]);
				i++;
			}
			else if (arr2[j] < arr1[i]) {
				al.add(arr2[j]);
				j++;
			}
			else {
				al.add(arr1[i]);
				i++;
				j++;
			}
		}
		
		while (i < n) {
			if (i > 0 && arr1[i-1] == arr1[i]) {
				i++;
				continue;
			}
			al.add(arr1[i]);
			i++;
		}
		
		while (j < m) {
			if (j > 0 && arr2[j-1] == arr2[j]) {
				j++;
				continue;
			}
			al.add(arr2[j]);
			j++;
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
