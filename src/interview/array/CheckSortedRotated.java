package interview.array;

public class CheckSortedRotated {
	public static void main(String[] args) {
		int [] arr = {3,4,5,3,2};
		printArray(arr);
		System.out.println(solution(arr));
	}

	private static boolean solution(int[] arr) {

		int cnt = 0;
		
		if (arr[0] < arr[arr.length-1]) {
			cnt++;
		}
		
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i] > arr[i+1]) {
				cnt++;
			}
			if (cnt >= 2) {
				return false;
			}
		}
		
		return true;
	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
