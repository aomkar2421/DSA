package binarySearch.OneD;

public class CountOccurances {
	public static void main(String[] args) {
		int [] arr = {5,7,7,7,7,7,7,7,7,7,8,8,10};
		printArray(arr);
		System.out.println(countFreq(arr, 7));
	}

	static int countFreq(int[] arr, int target) {
		int first = findFirst(arr, target);

		if (first == -1) {
			return 0;
		}

		int last = findLast(arr, target);

		return last-first+1;
	}

	private static int findLast(int[] arr, int target) {
		int n = arr.length;

		int i = 0;
		int j = n-1;
		int m = (i+j)/2;
		int last = -1;

		while (i <= j) {
			if (arr[m] == target) {
				last = m;
				i = m+1;
			}
			else if (arr[m] > target) {
				j = m-1;
			}
			else {
				i = m+1;
			}
			m = (i+j)/2;
		}

		return last;
	}

	private static int findFirst(int[] arr, int target) {
		int n = arr.length;

		int i = 0;
		int j = n-1;
		int m = (i+j)/2;
		int first = -1;

		while (i <= j) {
			if (arr[m] == target) {
				first = m;
				j = m-1;
			}
			else if (arr[m] < target) {
				i = m+1;
			}
			else {
				j = m-1;
			}
			m = (i+j)/2;
		}

		return first;
	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
