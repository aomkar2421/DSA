package array.hard;

import java.util.ArrayList;
import java.util.Arrays;

public class MissingAndRepeatingOptimal {
	public static void main(String[] args) {
		int [] arr = {4, 3, 6, 2, 1, 1};
		printArray(arr);
		System.out.println(findTwoElement(arr));
	}
	
    static ArrayList<Integer> findTwoElement(int arr[]) {
    	long s = 0, sn = 0;
    	long s2 = 0, s2n = 0;
    	int n = arr.length;
    	
    	for (int i = 0; i < arr.length; i++) {
			s = s +(long) arr[i];
			s2 = s2 +(long) (arr[i] * arr[i]);
		}
    	
    	sn = (n * (n+1))/2;
    	s2n = ( n*(n+1)*(2*n+1))/6;
    	
    	long val1 = s - sn;
    	long val2 = s2 - s2n;
    	val2 = val2/val1;
    	
    	long x = (val1 + val2)/2;
    	long y = x - val1;
    	
    	
    	
    	ArrayList<Integer> aList = new ArrayList<Integer>();
    	aList.add((int) x);
    	aList.add((int) y);    	
		return aList;      
    }

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
