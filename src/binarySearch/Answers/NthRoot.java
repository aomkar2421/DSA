package binarySearch.Answers;

public class NthRoot {
	public static void main(String[] args) {
		System.out.println(nthRoot(3, 27));
	}
	
    static int nthRoot(int n, int m) {
    	int i = 1;
    	int j = m;
    	int mid = (i+j)/2;
    	
    	while (i<=j) {
    		int val = 1;
    		for (int k = 1; k <= n; k++) {
				val = val * mid;
			}
    		
    		if (val == m) {
				return mid;
			}
    		else if (val > m) {
				j = mid-1;
			}
    		else {
				i = mid + 1;
			}
			
			mid = (i+j)/2;
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
