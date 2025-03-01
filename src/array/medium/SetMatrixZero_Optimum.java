package array.medium;

import java.util.ArrayList;

public class SetMatrixZero_Optimum {
	public static void main(String[] args) {
//		int [][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
		int [][] matrix = {{1,1,1,1},{1,1,0,1},{0,1,1,1},{1,0,1,1}};

		printMatrix(matrix);
		setZeroes(matrix);

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

		System.out.println(colZero);
		
		printMatrix(matrix);
	}

	private static void mapCol(int[][] matrix, int j) {
		for (int i = 0; i < matrix.length; i++) {
			if (matrix[i][j] != 0) {
				matrix[i][j] = -1;
			}
		}
	}


	private static void mapRow(int[][] matrix, int j) {
		for (int i = 0; i < matrix[0].length; i++) {
			if (matrix[j][i] != 0) {
				matrix[j][i] = -1;
			}
		}
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
