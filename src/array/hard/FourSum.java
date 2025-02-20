package array.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
	public static void main(String[] args) {
		int [] arr = {1,0,-1,0,-2,2};
		printArray(arr);
		System.out.println(fourSum(arr, 0));
	}
	
	public static List<List<Integer>> fourSum(int[] arr, int target) {
		int n = arr.length;
		Arrays.sort(arr);
		List<List<Integer>> ans = new ArrayList<List<Integer>>();

		for (int i = 0; i < arr.length; i++) {
			if (i > 0 && arr[i] == arr[i-1]) continue;
			for (int j = i+1; j < arr.length; j++) {
				if (j > i+1 && arr[j] == arr[j-1]) continue;

				int k = j+1;
				int l = n-1;

				while (k < l) {
					long sum = arr[i];
					sum += arr[j];
					sum += arr[k];
					sum += arr[l];
					if (sum == target) {
						List<Integer> temp = new ArrayList<>();
						temp.add(arr[i]);
						temp.add(arr[j]);
						temp.add(arr[k]);
						temp.add(arr[l]);
						ans.add(temp);
						k++;
						l--;

						while (k < l && arr[k] == arr[k - 1]) k++;
						while (k < l && arr[l] == arr[l + 1]) l--;
					}
					else if (sum < target) k++;
					else l--;

				}
			}
		}

		return ans;
	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
