package array.hard;

public class MergeArray {
	public static void main(String[] args) {
		int [] arr1 = {1,4,6,0,0};
		int [] arr2 = {2,5};
		printArray(arr1);
		printArray(arr2);
		merge(arr1, 3, arr2, arr2.length);
	}
	
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1;
        int k = m+n-1;

        while(j>=0){
            if(i >= 0 && nums1[i] > nums2[j]){
                nums1[k--] = nums1[i--];
            }else{
                nums1[k--] = nums2[j--];
            }
        }
    }

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
