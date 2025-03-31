package interview.array;

public class FindOneMissing3 {
	public static void main(String[] args) {
		int [] arr = {1, 2, 3, 5};
		printArray(arr);
		System.out.println(solution(arr));
	}

	private static int solution(int[] arr) {

		int [] hash = new int [arr.length+2];
		
		for (int i = 0; i < arr.length; i++) {
			hash[arr[i]]++;
		}
		
		for (int i = 1; i < hash.length; i++) {
			if (hash[i] == 0) {
				return i;
			}
		}
		
		return 0;
	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
