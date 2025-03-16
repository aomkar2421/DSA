package binarySearch.Matrix;

public class MatrixPeakElement2 {
	public static void main(String[] args) {
		int [][] matrix = {{10,20,15},{21,30,14},{7,16,32}};
		printMatrix(matrix);
		int [] arr = findPeakGrid(matrix);
		printArray(arr);
	}

	public static int[] findPeakGrid(int[][] mat) {
		int n = mat.length;
		int m = mat[0].length;
		
		int i = 0;
		int j = m-1;
		
		while (i <= j) {
			int mid = (i+j)/2;
			
			int rowIdx = findMaxInColumn(mat, mid);
			
			int left = mid-1 >= 0 ? mat[rowIdx][mid-1] : -1;
			int right = mid+1 < m ? mat[rowIdx][mid+1] : -1;


			if ( mat[rowIdx][mid] > right && mat[rowIdx][mid] > left) {
				return new int[] {rowIdx,mid};
			}
			else if (mat[rowIdx][mid] < left ) {
				j = mid-1;
			}
			else {
				i = mid+1;
			}

		}
		
		
		return new int [] {-1,-1};       
	}

	private static int findMaxInColumn(int[][] mat, int mid) {
		
		int max = -1;
		int idx = -1;
		
		for (int i = 0; i < mat.length; i++) {
			if (mat[i][mid] > max) {
				max = mat[i][mid];
				idx = i;
			}
		}
		
		return idx;
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

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
