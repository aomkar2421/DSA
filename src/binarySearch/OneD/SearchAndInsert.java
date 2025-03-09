package binarySearch.OneD;

public class SearchAndInsert {
	public static void main(String[] args) {
		int [] arr = {1,3,5,6};
		printArray(arr);
		System.out.println(searchInsert(arr, 0));
	}
	
    public static int searchInsert(int[] arr, int target) {
    	int i = 0;
    	int j = arr.length-1;
    	int m = i+(j-i)/2;
    	int ans = arr.length;
    	
    	while (i <= j) {
			if (arr[m] >= target) {
				ans = m;
				j = m-1;
			}
			else {
				i = m+1;
			}
			m = i+(j-i)/2;
		}
		return ans;
    }

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
