package array.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {
	public static void main(String[] args) {
		int [] arr = {-1,0,1,2,-1,-4};
		printArray(arr);
		System.out.println(threeSum(arr));
	}
	
    public static List<List<Integer>> threeSum(int[] arr) {
    	
    	Set<List<Integer>> st = new HashSet<List<Integer>>();
    			
		for (int i = 0; i < arr.length; i++) {
			Set<Integer> hs = new HashSet<Integer>();
			
			for (int j = i+1; j < arr.length; j++) {	
				int rem = -(arr[i] + arr[j]);

				if (hs.contains(rem)) {		
					List<Integer> temp = Arrays.asList(arr[i], arr[j], rem);
					temp.sort(null);
					st.add(temp);
				}
				hs.add(arr[j]);
			}
		}
		
		List<List<Integer>> ans = new ArrayList<List<Integer>>(st);
		return ans;
    }

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
