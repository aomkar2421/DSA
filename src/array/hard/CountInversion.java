package array.hard;

import java.util.ArrayList;

public class CountInversion {
	public static void main(String[] args) {
		int [] arr = {2, 4, 1, 3, 5};
		printArray(arr);
		System.out.println(inversionCount(arr));
	}

	static int inversionCount(int arr[]) {
		int count = mergeSort(arr, 0, arr.length-1);
		return count;
	}

	private static int mergeSort(int[] arr, int s, int e) {
		int count = 0;
		if(s >= e) return count;
		int m = s + (e-s)/2;
		count += mergeSort(arr, s, m);
		count += mergeSort(arr, m+1, e);

		count += merge(arr, s, m, e);
		return count;
	}


	private static int merge(int[] arr, int l, int mid, int r) {
		int count = 0;
		ArrayList<Integer> temp = new ArrayList<>();
		int left = l;
		int right = mid+1;

		while(left<=mid && right<=r) {
			if(arr[left] <= arr[right]) {
				temp.add(arr[left]);
				left++;
			} else {
				count += (mid - left + 1);
				temp.add(arr[right]);
				right++;
			}
		}

		while(left <= mid) {
			temp.add(arr[left]);
			left++;
		}

		while(right <= r) {
			temp.add(arr[right]);
			right++;
		}

		for(int i=l; i<=r; i++) {
			arr[i] = temp.get(i-l);
		}
		return count;
	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}

