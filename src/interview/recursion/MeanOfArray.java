package interview.recursion;

public class MeanOfArray {
	public static void main(String[] args) {
		int [] arr = {1, 2, 3, 4, 5}; ;
		solution(arr);
	}

	private static void solution(int [] arr) {

		
		int sum = solve(arr, 0, 0);
		System.out.println(sum/arr.length);
	}

	private static int solve(int[] arr, int i, int sum) {
		if (i >= arr.length) {
			return sum;
		}
		
		sum += arr[i];
		
		return solve(arr, i+1, sum);
	}
}
