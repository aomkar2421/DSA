package array.medium;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLadder {
	public static void main(String[] args) {
		int [] arr = {16, 17, 4, 3, 5, 2};
		printArray(arr);
		System.out.println(leaders(arr));
	}
	
    static ArrayList<Integer> leaders(int arr[]) {
    	int n = arr.length;
    	int largest = arr[n-1];
    	
    	ArrayList<Integer> al = new ArrayList<Integer>();
    	al.add(largest);
    	
    	for (int i = n-2; i >= 0; i--) {
			if (arr[i] >= largest) {
				largest = arr[i];
				al.add(largest);
			}
		}
    	Collections.reverse(al);
		return al;
    }

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
