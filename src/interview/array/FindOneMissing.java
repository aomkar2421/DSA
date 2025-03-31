package interview.array;

public class FindOneMissing {
	public static void main(String[] args) {
		int [] arr = {1, 2, 3, 5};
		printArray(arr);
		System.out.println(solution(arr));
	}

	private static int solution(int[] arr) {

		int ans1 = 0;
		
		for (int i = 0; i < arr.length; i++) {
			ans1 = ans1 ^ arr[i];
		}
		
		for (int i = 0; i <= arr.length+1; i++) {
			ans1 = ans1 ^ i;
		}
		return ans1;
	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
