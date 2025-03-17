package binarySearch.Matrix;

public class MatrixMedian {
	public static void main(String[] args) {
		int [][] matrix = {{1,3,5},{2,6,9},{3,6,9}};
		printMatrix(matrix);
		System.out.println(median(matrix));
	}

    static int median(int mat[][]) {
    	int n = mat.length;
    	int m = mat[0].length;
    	
    	int low = findLow(mat);
    	int high = findHigh(mat);

    	int mid = (low+high)/2;
    	int medianCount = (n*m)/2;
    	
    	while (low <= high) {
    		
    		int count = findCount(mat, mid);
    		if (count <= medianCount) {
				low = mid+1;
			}
    		else {
				high = mid-1;
			}
    		
    		mid = (low+high)/2;
		}
    	
        return low;
    }

	private static int findCount(int[][] mat, int mid) {
		int count = 0;
		
		for (int i = 0; i < mat.length; i++) {
			count += upperBound(mat[i], mid);
		}
		
		return count;
	}

	private static int upperBound(int[] arr, int num) {
		int i = 0;
		int j = arr.length-1;
		
		while (i <= j) {
			int mid = (i+j)/2;
			
			if (arr[mid] > num) {
				j = mid-1;
			}
			else {
				i = mid+1;
			}
		}
		
		return i;
	}

	private static int findHigh(int[][] mat) {
		int m = mat[0].length-1;
		
		int max = Integer.MIN_VALUE;
		
		for (int i = 0; i < mat.length; i++) {
			if (mat[i][m] > max) {
				max = mat[i][m];
			}
		}
		return max;
	}

	private static int findLow(int[][] mat) {
		int min = Integer.MAX_VALUE;
		
		for (int i = 0; i < mat.length; i++) {
			if (mat[i][0] < min) {
				min = mat[i][0];
			}
		}
		return min;
	}

	public static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}

}
