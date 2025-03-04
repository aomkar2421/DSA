package array.medium;

public class RotateBy90 {
	public static void main(String[] args) {
		int [][] matrix = createMatrix(4,4);

		printMatrix(matrix);
		rotate(matrix);

	}

	
	public static void rotate(int[][] matrix) {
		int r = matrix.length;
		int c = matrix[0].length;
		int n = matrix.length;
		
		int [][] arr = new int[r][c];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[j][n-i-1] = matrix[i][j];
			}
		}
		
		printMatrix(arr);
	}

	
	private static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}

	private static int[][] createMatrix(int r, int c) {
		int [][] matrix = new int [r][c];

		int k=1;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = k++;
			}
		}
		return matrix;
	}
}
