package binarySearch.OneD;

public class MinimumInRotatedSorted {
	public static void main(String[] args) {
		int [] arr = {4,5,6,7,8,9,1,2,3};
		printArray(arr);
		System.out.println(findMin(arr));
	}
	
    public static int findMin(int[] arr) {
    	
    	int n = arr.length;
    	int i = 0;
    	int j = n-1;
    	int m = (i+j)/2;
    	int min = Integer.MAX_VALUE;
    	
    	if (arr[i] < arr[j]) {
			return arr[0];
		}
    	
    	while (i <= j) {

			if (arr[i] <= arr[m]) {
				min = Math.min(arr[i], min);
				i = m +1;
			}else {
				min = Math.min(arr[m], min);
				j = m-1;
			}
			m = (i+j)/2;
		}
    	
        return min;
    }

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
