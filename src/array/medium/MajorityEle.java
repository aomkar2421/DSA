package array.medium;

public class MajorityEle {
	public static void main(String[] args) {
		int [] arr = {1,2,7,2,2,8,2};
		printArray(arr);
		System.out.println(majorityElement(arr));
	}

	public static int majorityElement(int[] arr) {
		int candidate=arr[0];
		int votes = 0;

		for (int i = 0; i < arr.length; i++) {

			if (votes==0) {
				candidate = arr[i];
			}

			if (arr[i] == candidate) {
				votes++;
			}
			else {
				votes--;
			} 

		}
		
		return candidate;

	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
