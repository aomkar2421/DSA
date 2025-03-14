package binarySearch.Answers;

public class SmallestDivisor {
	public static void main(String[] args) {
		int [] arr = {44,22,33,11,1};
		printArray(arr);
		System.out.println(smallestDivisor(arr, 5));
	}
	
    public static int smallestDivisor(int[] arr, int threshold) {
    	
    	int max = Integer.MIN_VALUE;
    	
    	for (int i = 0; i < arr.length; i++) {
			max = Math.max(max, arr[i]);
		}

    	for (int i = 1; i <= max; i++) {
    		int sum = 0;
			for (int j = 0; j < arr.length; j++) {
				sum += Math.ceil(arr[j]/ i);
			}
			if (sum <= threshold) {
				return i;
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
