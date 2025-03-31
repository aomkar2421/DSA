package interview.array;

public class FindOneMissing2 {
	public static void main(String[] args) {
		int [] arr = {1, 2, 3, 5};
		printArray(arr);
		System.out.println(solution(arr));
	}

	private static int solution(int[] arr) {

		int ans1 = 0, ans2 = 0;
		
		for (int i = 0; i < arr.length; i++) {
			ans1 = ans1 + arr[i];
		}
		
		int n = arr.length+1;
		ans2 = (n * (n+1))/2;
		
		return ans2-ans1;
	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
