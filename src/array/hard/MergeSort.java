package array.hard;

import java.util.ArrayList;

public class MergeSort {
	public static void main(String[] args) {
		int [] arr = {2, 4, 1, 3, 5, 0 , 9, 1, 6, 5, 3, 4, 2, 1};
		printArray(arr);
		mergeSort(arr, 0, arr.length-1);
		printArray(arr);
	}
	
	
	private static void mergeSort(int[] arr, int s, int e) {
		if(s >= e) return ;
		int m = s + (e-s)/2;
		mergeSort(arr, s, m);
		mergeSort(arr, m+1, e);
		
		merge(arr, s, m, e);
	}

	private static void merge(int[] arr, int low, int mid, int high) {

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
	}

//	private static int merge(int[] arr, int low, int mid, int high) {
//	    int count = 0;
//		ArrayList<Integer> temp = new ArrayList<>();
//        int left = low;
//        int right = mid+1;
//        
//        while(left<=mid && right<=high) {
//            if(arr[left] <= arr[right]) {
//                temp.add(arr[left]);
//                left++;
//            } else {
//                count += (mid - left + 1);
//                temp.add(arr[right]);
//                right++;
//            }
//        }
//        
//        while(left <= mid) {
//            temp.add(arr[left]);
//            left++;
//        }
//        
//        while(right <= high) {
//            temp.add(arr[right]);
//            right++;
//        }
//        
//        for(int i=low; i<=high; i++) {
//            arr[i] = temp.get(i);
//        }
//        return count;
//	}


	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
