package binarySearch.Answers;

public class SmallestDivisor2 {
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
    	
    	int i = 1;
    	int j = max;
    	int m = (i+j)/2;
    	int ans = -1;
    	
    	while (i <= j) {
    		
    		int sum = findDivSum(arr, m);
    		
			if (sum <= threshold) {
				ans = m;
				j = m - 1;
			}
			else if (sum > threshold) {
				i = m + 1;
			}
			
			m = (i+j)/2;
		}
    	
        return ans;
    }
    
    
    public static int findDivSum(int[] arr, int i) {
    	int sum = 0;
    	for (int j = 0; j < arr.length; j++) {
			sum +=Math.ceil(arr[j]/i);
		}
    	return sum;
    }

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
