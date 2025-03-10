package binarySearch.Answers;

public class MissingPositiveInteger2 {
	public static void main(String[] args) {
		int [] arr = {2,3,4,7,11};
		printArray(arr);
		System.out.println(findKthPositive(arr, 5));
	}
	
    public static int findKthPositive(int[] arr, int k) {
    	
    	int n = arr.length;
    	
    	for (int i = 0; i < n; i++) {
			if (arr[i] <= k) {
				k++;
			}
			else {
				break;
			}
		}
    	
        return k;
    }

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
