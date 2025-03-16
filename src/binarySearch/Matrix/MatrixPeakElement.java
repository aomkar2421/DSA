package binarySearch.Matrix;

public class MatrixPeakElement {
	public static void main(String[] args) {
		int [][] matrix = {{10,20,15},{21,30,14},{7,16,32}};
		printMatrix(matrix);
		int [] arr = findPeakGrid(matrix);
		printArray(arr);
	}

	public static int[] findPeakGrid(int[][] mat) {
		int n = mat.length;
		int m = mat[0].length;
		
		int max = Integer.MIN_VALUE;
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				int top = i-1 >= 0 ? mat[i-1][j] : -1;
				int bottom = i+1 < n ? mat[i+1][j] : -1;
				int left = j-1 >= 0 ? mat[i][j-1] : -1;
				int right = j+1 < m ? mat[i][j+1] : -1;
				if (mat[i][j] > top && mat[i][j] > right && mat[i][j] > bottom && mat[i][j] > left) {
					return new int[] {i,j};
				}
			}
		}
		
		return new int [] {-1,-1};       
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
