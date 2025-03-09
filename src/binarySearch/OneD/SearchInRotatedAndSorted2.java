package binarySearch.OneD;

public class SearchInRotatedAndSorted2 {
	public static void main(String[] args) {
		int [] arr = {4,5,6,7,8,9,1,2,3};
		printArray(arr);
		System.out.println(search(arr, 2));
	}
	
    public static int search(int[] arr, int target) {
    	
    	int i = 0;
    	int j = arr.length-1;
    	int m = (i+j)/2;
    	
    	while (i <= j) {
			if (arr[m] == target) {
				return m;
			}
			if (arr[i] <= arr[m] && arr[m] <= arr[j]) {
				i++;
				j--;
				continue;
			}
			else if ( arr[i] <= arr[m] ) {
				if(arr[i] <= target && target <= arr[m]) {
					j = m-1;
				}else {
					i = m + 1;
				}
			}
			else {
				if (arr[m] <= target && target <= arr[j] ) {
					i = m +1;
				}
				else {
					j = m -1;
				}
			}
			m = (i+j)/2;
		}
        
    	return m;
    }

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
