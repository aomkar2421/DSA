package interview.array;

public class MajorityElement {
	public static void main(String[] args) {
		int [] arr = {3, 3, 4, 2, 4, 4, 2, 4};
		printArray(arr);
		System.out.println(solution(arr));
	}

	private static int solution(int[] arr) {

		int n = arr.length;
		int cand = arr[0];
		int count = 1;
		
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == cand) {
				count++;
			}else {
				count--;
			}
			
			if (count == 0) {
				cand = arr[i];
				count++;
			}
		}
		
		count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == cand) {
				count++;
			}
		}
		
		return count > n/2 ? cand : -1;
	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
