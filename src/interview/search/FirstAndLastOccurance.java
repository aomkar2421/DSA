package interview.search;

public class FirstAndLastOccurance {
	public static void main(String[] args) {
		int [] arr = {5,7,7,8,8,10};
		printArray(arr);
		int [] ans = solution(arr, 11);
		printArray(ans);
	}

	private static int[] solution(int[] arr, int k) {

		int firstOccurance = findFirstOccurance(arr, k);
		if (firstOccurance == -1) {
			return new int [] {-1,-1};
		}
		int lastOccurance = findLastOccurance(arr, k);
		return new int [] {firstOccurance, lastOccurance};
	}

	private static int findLastOccurance(int[] arr, int k) {
		int l = 0;
		int h = arr.length-1;
		int m = (l+h)/2;
		int idx = -1;
		
		while (l <= h) {
			
			if (arr[m] <= k) {
				if (arr[m] == k) {
					idx = m;
				}
				l = m+1;
			}
			else {
				h = m-1;
			}
			
			m = (l+h)/2;
		}
		
		return idx;
	}

	private static int findFirstOccurance(int[] arr, int k) {

		int l = 0;
		int h = arr.length-1;
		int m = (l+h)/2;
		int idx = -1;
		
		while (l <= h) {
			
			if (arr[m] >= k) {
				if (arr[m] == k) {
					idx = m;
				}
				h = m-1;
			}
			else {
				l = m+1;
			}
			
			m = (l+h)/2;
		}
		
		return idx;
	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
