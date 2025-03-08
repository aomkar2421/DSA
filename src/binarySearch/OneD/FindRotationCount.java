package binarySearch.OneD;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindRotationCount {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.addAll(Arrays.asList(5,6,1,2,3,4));
		System.out.println(list);
		System.out.println(findKRotation(list));
	}

	public static int findKRotation(List<Integer> arr) {
		int n = arr.size();
		
		if (n==1) {
			return 0;
		}
		
		int low = 0;
		int high = n-1;
		int mid = (low+high)/2;
		int ans = Integer.MAX_VALUE;
		
		int index = -1;
		
		if (arr.get(low) < arr.get(high)) {
			return 0;
		}
		
		while (low <= high) {
			
			if (arr.get(low) <= arr.get(mid)) {
				if (arr.get(low) < ans) {
					ans = arr.get(low);
					index = low;
				}
				low = mid+1;
			}
			else {
				if (arr.get(mid) < ans) {
					ans = arr.get(mid);
					index = mid;
				}
				high = mid-1;
			}
			mid = (low+high)/2;
		}
		
		return index;
	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
