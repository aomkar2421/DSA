package interview.search;

public class MinInSortedRotated {
	public static void main(String[] args) {
		int [] arr = {7,8,9,1,2,3,4,5,6};
		printArray(arr);
		System.out.println(solution(arr));
	}

	private static int solution(int[] arr) {

		int min = Integer.MAX_VALUE;
		
		int l = 0;
		int h = arr.length-1;
		int m = (l+h)/2;
		
		if (arr[l] < arr[h]) {
			return arr[l];
		}
		
		while (l<=h) {
			if (arr[m] > arr[h]) {
				min = Math.min(arr[l], min);
				l = m+1;
			}
			else {
				min = Math.min(min, arr[m]);
				h = m-1;
			}
			m = (l+h)/2;
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
