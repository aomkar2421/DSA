package array.easy;

import java.util.HashMap;

public class HashmapPractise {
	public static void main(String[] args) {
		int [] arr = {10, 5, 2, 7, 1, -10};
		printArray(arr);
		int k = 15;
		solution(arr, k);
	}
	
    public static int solution(int[] arr, int k) {
    	
    	HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
    	
    	for (int i = 0; i < arr.length; i++) {
			hm.put(i, arr[i]);
		}
    	
    	for (int i = 0; i < arr.length; i++) {
    		System.out.println(hm.get(i));
		}
    	
        return 0;
    }

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
