package interview.search;

public class MissingNumBinarySearch {
	public static void main(String[] args) {
		int [] arr = {1,2,3,5};
		printArray(arr);
		System.out.println(solution(arr));
	}

	private static int solution(int[] arr) {

		int low = 0;
		int high = arr.length-1;
		int ans = -1;
		
		while (low <= high) {
			int m = (low+high)/2;
			
			if (arr[m] != m+1) {
				ans = m+1;
				high = m-1;
			}
			else {
				low = m+1;
			}
			
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
