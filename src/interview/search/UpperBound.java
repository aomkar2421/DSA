package interview.search;

public class UpperBound {
	public static void main(String[] args) {
		int [] arr = {2,3,7,10,11,11,25};
		printArray(arr);
		System.out.println(solution(arr, 10));
	}

	private static int solution(int[] arr, int k) {

		int l = 0;
		int h = arr.length-1;
		int m = (l+h)/2;
		int idx = arr.length;
		
		while (l <= h) {
			
			if (arr[m] >  k) {
				h = m-1;
				idx = m;
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
