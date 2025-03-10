package binarySearch.Answers;

public class MissingPositiveInteger {
	public static void main(String[] args) {
		int [] arr = {2,3,4,7,11};
		printArray(arr);
		System.out.println(findKthPositive(arr, 5));
	}
	
    public static int findKthPositive(int[] arr, int k) {
    	
    	int count = 0;
    	int j = 0;
    	int n = arr.length;
    	
    	for (int i = 1; i <= Integer.MAX_VALUE; i++) {
			if (i == arr[j] && j < n) {
				j++;
			}
			else {
				count++;
				if (count == k) {
					return i;
				}
			}
		}
    	
        return -1;
    }

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
