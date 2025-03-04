package array.easy;

public class RotateRightWithExtraSpace {
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,6,7,8};
		int k = 3;
		printArray(arr);
		solution(arr, k);
	}

	private static void solution(int[] arr, int k) {
		int n = arr.length;
		int [] newArr = new int [arr.length];
		int j = 0;
		for (int i = n-k; i < n; i++) {
			newArr[j] = arr[i];
			j++;
		}
		
		for (int i = 0; i < n-k; i++) {
			newArr[j] = arr[i];
			j++;
		}
		
		printArray(newArr);
		
	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
