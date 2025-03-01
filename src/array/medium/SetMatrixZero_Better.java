package array.medium;

import java.util.ArrayList;

public class SetMatrixZero_Better {
	public static void main(String[] args) {
		int [][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};

		printMatrix(matrix);
		setZeroes(matrix);

	}


	public static void setZeroes(int[][] matrix) {
		
		int [] row = new int [matrix.length];
		int [] col = new int [matrix[0].length];


		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {

				if (matrix[i][j] == 0) {
					row[i] = 1;
					col[j] = 1;
				}

			}
		}
			
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {

				if (row[i] == 1 || col[j] == 1) {
					matrix[i][j] = 0;
				}

			}
		}
		
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


	public static void printMatrix(int[][] matrix) {
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
