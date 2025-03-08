package binarySearch.OneD;

public class LowerBond {
	public static void main(String[] args) {
		int [] arr = {2, 3, 7, 10, 11, 11, 11, 11, 25};
		printArray(arr);
		System.out.println(lowerBound(arr, 11));
	}
	
    static int lowerBound(int[] arr, int target) {
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
