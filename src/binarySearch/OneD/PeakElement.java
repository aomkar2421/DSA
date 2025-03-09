package binarySearch.OneD;

public class PeakElement {
	public static void main(String[] args) {
		int [] arr = {1,2,1,3,5,6,4};
		printArray(arr);
		System.out.println(findPeakElement(arr));
	}

	public static int findPeakElement(int[] arr) {
		int n = arr.length;

		if (n == 1) {
			return 0;
		}

		if (arr[0] > arr[1]) {
			return 0;
		}

		if (arr[n-1] > arr[n-2]) {
			return n-1;
		}

		int low = 1;
		int high = n-2;
		int mid = (low+high)/2;

		while (low <= high) {
			if (arr[mid-1] < arr[mid] && arr[mid] > arr[mid+1]) {
				return mid;
			}
			else if (arr[mid-1] < arr[mid] ) {
				low = mid+1;
			}else {
				high = mid-1;
			}
			mid = (low+high)/2;
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
