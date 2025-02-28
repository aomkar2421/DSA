package array.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSumOptimal {
	public static void main(String[] args) {
		int [] arr = {-1,0,1,2,-1,-4};
		printArray(arr);
		System.out.println(threeSum(arr));
	}
	
    public static List<List<Integer>> threeSum(int[] arr) {
    	int n = arr.length;
    	Arrays.sort(arr);
		List<List<Integer>> ans = new ArrayList<List<Integer>>();

		for (int i = 0; i < arr.length; i++) {

			if (i > 0 && arr[i] == arr[i-1]) continue;
			int j = i+1;
			int k = n-1;			
			while (j < k) {
				int sum = arr[i] + arr[j] + arr[k];
				if (sum < 0) {
					j++;
				}
				else if (sum > 0) {
					k--;
				}else {
					List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k]);
					ans.add(temp);
					j++;
					k--;
					while (j<k && arr[j] == arr[j-1]) j++;
					while (j<k && arr[k] == arr[k+1]) k--;
				}
			}
			
		}
		
		return ans;
    }

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
