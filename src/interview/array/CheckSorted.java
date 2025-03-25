package interview.array;

public class CheckSorted {
	public static void main(String[] args) {
		int [] arr = {1,3,5,4};
		printArray(arr);
		System.out.println(solution(arr));
	}

	private static boolean solution(int[] arr) {

		int cnt = 0;
		
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i] > arr[i+1]) {
				cnt++;
			}
			if (cnt >= 1) {
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
