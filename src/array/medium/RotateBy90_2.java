package array.medium;

public class RotateBy90_2 {
	public static void main(String[] args) {
		int [][] matrix = createMatrix(4,4);

		printMatrix(matrix);
		rotate(matrix);

	}


	public static void rotate(int[][] matrix) {
		int r = matrix.length;
		int c = matrix[0].length;
		int n = matrix.length;

		//MY TRANSPOSE
		for (int i = 0; i < n-1; i++) {
			for (int j = i+1; j < n; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}

		printMatrix(matrix);

		//MY REVERSE
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n/2; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[i][n-1-j];
				matrix[i][n-1-j] = temp;
			}
		}

		printMatrix(matrix);
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
