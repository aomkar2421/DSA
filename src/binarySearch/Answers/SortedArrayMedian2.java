package binarySearch.Answers;

public class SortedArrayMedian2 {
	public static void main(String[] args) {
//		int [] arr1 = {1,3,4,6,9,11};
//		int [] arr2 = {7,13,14,15};
		int [] arr1 = {1,2};
		int [] arr2 = {3,4};
		printArray(arr1);
		printArray(arr2);
		System.out.println(findMedianSortedArrays(arr1, arr2));
	}
	
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
    	
    	int n1 = nums1.length;
    	int n2 = nums2.length;
    	int n = n1+n2;
    	
    	if (n1 > n2) return findMedianSortedArrays(nums2, nums1);
    	
    	int left = (n1 + n2 + 1)/2;
    	int low = 0;
    	int high = n1;

    	while (low <= high) {
    		
    		int mid1 = (low + high)/2;
        	int mid2 = left-mid1;
			
    		int l1 = Integer.MIN_VALUE;
    		int l2 = Integer.MIN_VALUE;
    		int r1 = Integer.MAX_VALUE;
    		int r2 = Integer.MAX_VALUE;
    		
    		if (mid1 > 0) l1 = nums1[mid1-1];
    		if (mid2 > 0) l2 = nums2[mid2-1];
    		if (mid1 < n1) r1 = nums1[mid1];
    		if (mid2 < n2) r2 = nums2[mid2];

    		if (l1 <= r2 && l2 <= r1) {
    			if (n%2 == 1) return Math.max(l1, l2);
//              else return ( (Math.max(l1, l2) + Math.min(r1, r2))) / 2.0;
    			else {
    				int m1 = Math.max(l1, l2);
    				int m2 = Math.min(r1, r2);
    				
    				return (m1+m2)/2.0;
    				
    			}
    		}
    		
    		else if (l1 > r2) {
				high = mid1 - 1;
			}
    		else {
				low = mid1 + 1;
			}

		}
    	
		return -1;        
    }

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) { 
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
