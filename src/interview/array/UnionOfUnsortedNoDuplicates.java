package interview.array;

import java.util.ArrayList;
import java.util.HashSet;

public class UnionOfUnsortedNoDuplicates {
	public static void main(String[] args) {
		int [] arr1 = {1, 2, 3};
		int [] arr2 = {5, 2, 7};
		printArray(arr1);
		printArray(arr2);
		solution(arr1, arr2);
	}

	private static void solution(int[] arr1, int[] arr2) {

		HashSet<Integer> hs = new HashSet<Integer>();

		for (int num : arr1) {
			hs.add(num);
		}

		for (int num : arr2) { // or also can use binary search
			hs.add(num);
		}
		ArrayList<Integer> al = new ArrayList<Integer>(hs);
		System.out.println(al);
	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

}
