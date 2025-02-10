package array.medium;

public class SetMatrixZero {
	public static void main(String[] args) {
		int [][] arr = { {1,1,1}, {1,0,1}, {1,1,0}};
		printMatrix(arr);
		setZeroes(arr);
	}

	public static void setZeroes(int[][] matrix) {

		int colZero=-1;

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {	
				if (matrix[i][j] == 0) {

					matrix[i][0] = 0;

					if(j==0) colZero = 0;
					else matrix[0][j] = 0;
				}
			}
		}

		for (int i = matrix.length-1; i >= 1; i--) {
			for (int j = matrix[0].length-1; j >= 1; j--) {	
				if (matrix[i][j] != 0) {
					if (matrix[i][0] == 0 || matrix[0][j] == 0) {
						matrix[i][j] = 0;
					}
				}
			}
		}

		if (matrix[0][0] == 0) {
			for (int i = 1; i < matrix[0].length; i++) {
				matrix[0][i] = 0;
			}
		}

		if (colZero == 0) {
			for (int i = 0; i < matrix.length; i++) {
				matrix[i][0] = 0;
			}
		}	
		
		printMatrix(matrix);
	}

	private static void printMatrix(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
