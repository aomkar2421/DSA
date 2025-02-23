package array.hard;

import java.util.ArrayList;

public class ReversePairs {
	public static void main(String[] args) {
		int [] arr = {1,3,2,3,1};
		printArray(arr);
		System.out.println(reversePairs(arr));
	}
	
    public static int reversePairs(int[] nums) {
        return mergeSort(nums, 0, nums.length-1);
    }

    private static int mergeSort(int[] arr, int s, int e) {
		int count = 0;
		if(s >= e) return count;
		int m = (s+e)/2;
		count += mergeSort(arr, s, m);
		count += mergeSort(arr, m+1, e);
		count += countPairs(arr, s, m, e);
		merge1(arr, s, m, e);
		return count;
	}

	private static int countPairs(int[] arr, int low, int mid, int high) {
		int count = 0;
		int right = mid + 1;

		for (int i = low; i <= mid; i++) {
			while ( right <= high && arr[i] > 2 * arr[right] ) {
				right++;
			}
			count += right - (mid + 1);
		}

		return count;
	}


	private static void merge1(int[] arr, int low, int mid, int high) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		int left = low;
		int right = mid + 1;

		while (left <= mid && right <= high) {
			if (arr[left] <= arr[right]) {
				al.add(arr[left]);
				left++;
			}
			else {
				al.add(arr[right]);
				right++;
			}
		}

		while (left <= mid) {
			al.add(arr[left++]);
		}

		while (right <= high) {
			al.add(arr[right++]);
		}

		for (int i = 0; i < al.size(); i++) {
			arr[low+i] = al.get(i);
		}
	}


	private static int merge2(int[] arr, int low, int mid, int high) {
		int count = 0;

		int n1 = mid - low + 1;
		int n2 = high - mid;

		int [] arr1 = new int[n1];
		int [] arr2 = new int[n2];

		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = arr[low+i];
		}

		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = arr[mid+1+i];
		}


		int i = 0;
		int j = 0;
		int k = low;

		while (i < n1 && j < n2) {
			if (arr1[i] <= arr2[j]) {
				arr[k] = arr1[i];
				i++;
			}
			else {
				int l = low;
				while (l <= mid) {
					if (arr[l] > 2 * arr[j]) {
						count++;
					}
					l++;
				}
				arr[k] = arr2[j];
				j++;
			}
			k++;
		}

		while (i < n1) {
			arr[k++] = arr1[i++];
		}

		while (j < n2) {
			arr[k++] = arr2[j++];
		}
		return count;
	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
