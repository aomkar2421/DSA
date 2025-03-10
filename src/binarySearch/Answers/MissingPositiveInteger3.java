package binarySearch.Answers;

public class MissingPositiveInteger3 {
	public static void main(String[] args) {
		int [] arr = {2,3,4,7,11};
		printArray(arr);
		System.out.println(findKthPositive(arr, 5));
	}
	
    public static int findKthPositive(int[] arr, int k) {
    	    	
    	int i = 0;
    	int j = arr.length-1;
    	int m = (i+j)/2;
    	
    	while (i <= j) {
			int missing = arr[m]-(m+1);
			
			if (missing < k) {
				i = m+1;
			}
			else {
				j = m-1;
			}
			m = (i+j)/2;
		}
    	
    	int ans = k + j +1 ;
    	
        return ans;
    }

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
