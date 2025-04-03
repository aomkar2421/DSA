package interview.array;

public class RemoveDuplicatesUnsorted {
	public static void main(String[] args) {
		int [] arr = {0,0,1,1,1,2,2,3,3,4};
		printArray(arr);
		System.out.println(solution(arr));
	}

	private static int solution(int[] arr) {

		int j = 0;
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i] != arr[i+1]) {
				arr[j] = arr[i];
				j++;
			}
		}
		
		arr[j++] = arr[arr.length-1];
		printArray(arr);
		
		return j;
	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
