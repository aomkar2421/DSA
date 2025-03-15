package binarySearch.Answers;

public class SquareRoot {
	public static void main(String[] args) {
		System.out.println(floorSqrt(4));
	}
	
    static int floorSqrt(int n) {
    	int i = 1;
    	int j = n;
    	int m = (i+j)/2;
    	int ans = Integer.MIN_VALUE;
    	
    	while (i<=j) {
			if (m*m <= n) {
				if (m > ans) {
					ans = m;
				}
				i = m+1;
			}
			else {
				j = m-1;
			}
			m = (i+j)/2;
		}
    	
       return ans; 
    }

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
