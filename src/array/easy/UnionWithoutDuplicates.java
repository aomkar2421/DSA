package array.easy;

import java.util.ArrayList;

public class UnionWithoutDuplicates {
	public static void main(String[] args) {
		int [] arr1 = {1,2,3,4,5};
		int [] arr2 = {1,2,3,6,7};
		printArray(arr1);
		printArray(arr2);
		solution(arr1, arr2);
	}

	private static void solution(int[] arr1, int[] arr2) {
		int i=0, j=0;
		int n1=arr1.length, n2=arr2.length;

		ArrayList<Integer> al = new ArrayList<Integer>();
		int prev = 0;

		while (i<n1 && j<n2) {
			if(arr1[i] <= arr2[j]) {
				if ( prev != arr1[i]) {
					al.add(arr1[i]);
					prev = arr1[i];
				}
				i++;
			}else{
				if (prev != arr2[j]) {
					al.add(arr2[j]);
					prev = arr2[j];
				}
				j++;
			}
		}

		while (i<n1) {
			if (arr1[i] != prev) {
				al.add(arr1[i]);
				prev = arr1[i];
			}
			i++;
		}
		
		while (j<n2) {
			if (arr2[j] != prev) {
				al.add(arr2[j]);
				prev = arr2[j];
			}
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
