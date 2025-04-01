package interview.array;

import java.util.ArrayList;
import java.util.HashSet;

public class IntersectionOfUnsortedDuplicates {
	public static void main(String[] args) {
		int [] arr1 = {4,9,5};
		int [] arr2 = {9,4,9,8,4};
		printArray(arr1);
		printArray(arr2);
		solution(arr1, arr2);
	}
	
	private static void solution(int[] arr1, int[] arr2) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		HashSet<Integer> hs = new HashSet<Integer>();
		
		int n = arr1.length;
		int m = arr2.length;
		
		for (int i = 0; i < arr1.length; i++) {
			hs.add(arr1[i]);
		}
		
		for (int i = 0; i < arr2.length; i++) {
			if (hs.contains(arr2[i])) {
				al.add(arr2[i]);
				hs.remove(arr2[i]);
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
