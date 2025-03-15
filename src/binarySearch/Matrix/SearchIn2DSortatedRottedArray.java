package binarySearch.Matrix;

public class SearchIn2DSortatedRottedArray {
	public static void main(String[] args) {
		int [][] matrix = { {1,4,7,11,15}, {2,5,8,12,19}, {3,6,9,10,22}, {10,13,14,17,24}, {18,21,23,26,30} };
		printMatrix(matrix);
		System.out.println(searchMatrix(matrix, 13));
	}

	public static boolean searchMatrix(int[][] matrix, int target) {

		int n = matrix.length;
		int m = matrix[0].length;

		int row = 0;
		int col = m-1;
		
		
		while (col >= 0 && row < n) {
			
			if (matrix[row][col] == target) {
				return true;
			}
			else if (matrix[row][col] < target) {
				row++;
			}
			else {
				col--;
			}
		}

		return false;
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
