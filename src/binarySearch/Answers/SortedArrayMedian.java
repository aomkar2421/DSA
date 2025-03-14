package binarySearch.Answers;

public class SortedArrayMedian {
	public static void main(String[] args) {
//		int [] arr1 = {1,3,4,7,10,12,15};
//		int [] arr2 = {2,3,6};
		int [] arr1 = {1,3};
		int [] arr2 = {2};
		printArray(arr1);
		printArray(arr2);
		System.out.println(findMedianSortedArrays(arr1, arr2));
	}
	
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
    	
    	int n1 = nums1.length;
    	int n2 = nums2.length;
    	
    	int n = n1+n2;

    	int idx2 = n/2;
    	int idx1 = idx2-1;
    	
    	double idx1Ele = -1;
    	double idx2Ele = -1;
    	int count = 0;
    	
    	int i = 0;
    	int j = 0;
    	while ( i < n1 && j < n2 ) {
			if (nums1[i] < nums2[j]) {
				if (count == idx1) idx1Ele = nums1[i];
				if (count == idx2) idx2Ele = nums1[i];
				i++;
				count++;
			}else {
				if (count == idx1) idx1Ele = nums2[j];
				if (count == idx2) idx2Ele = nums2[j];
				j++;
				count++;
			}
		}
    	
    	while (i < n1) {
    		if (count == idx1) idx1Ele = nums1[i];
			if (count == idx2) idx2Ele = nums1[i];
			i++;
			count++;
		}
		
    	while (j < n2) {
    		if (count == idx1) idx1Ele = nums2[j];
			if (count == idx2) idx2Ele = nums2[j];
			j++;
			count++;
		}
    	
    	if (n%2 != 0) return idx2Ele;
    	
		return (idx1Ele+idx2Ele)/2;        
    }

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
