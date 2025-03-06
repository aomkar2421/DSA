package array.hard;

import java.util.ArrayList;
import java.util.Arrays;

public class MissingAndRepeating {
	public static void main(String[] args) {
		int [] arr = {4, 3, 6, 2, 1, 1};
		printArray(arr);
		findTwoElement(arr);
	}
	
    static ArrayList<Integer> findTwoElement(int arr[]) {
    	int repeating = -1;
    	int missing = -1;
    	
    	int [] visiting = new int[arr.length+1];
    	
    	for (int i = 0; i < arr.length; i++) {
			visiting[arr[i]]++;
		}
    	printArray(arr);
    	printArray(visiting);
    	
    	for (int i = 1; i < visiting.length; i++) {
			if (visiting[i] == 0) {
				missing = i;
			}
			if (visiting[i] == 2) {
				repeating = i;
			}
		}
    	
    	System.out.println(repeating+" "+missing);
    	ArrayList<Integer> aList = new ArrayList<Integer>();
    	aList.add(repeating);
    	aList.add(missing);
		return aList;      
    }

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
