package array.medium;

import java.util.ArrayList;

public class SpiralMatrix {
	public static void main(String[] args) {
		int [][] matrix = new int [5][5];

		int k=1;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = k++;
			}
		}

		printMatrix(matrix);
		
		System.out.println(spiralOrder(matrix));

	}

	public static ArrayList<Integer> spiralOrder(int[][] matrix) {
		int rowStart = 0;
		int rowEnd = matrix.length-1;
		int colStart = 0;
		int colEnd = matrix[0].length-1;
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		while (rowStart <= rowEnd && colStart <= colEnd) {
			//top
			for (int i = colStart; i <= colEnd; i++) {
				System.out.print(matrix[rowStart][i]+" ");
				al.add(matrix[rowStart][i]);
			}
			rowStart++;
			
			//right
			for (int i = rowStart; i <= rowEnd; i++) {
				System.out.print(matrix[i][colEnd]+" ");
				al.add(matrix[i][colEnd]);
			}
			colEnd--;
			
			//bottom
			if (rowStart<=rowEnd) {
				for (int i = colEnd; i >= colStart; i--) {
					System.out.print(matrix[rowEnd][i]+" ");
					al.add(matrix[rowEnd][i]);
				}
				rowEnd--;
			}

			//left
			if (colStart <= colEnd) {
				for (int i = rowEnd; i >=rowStart; i--) {
					System.out.print(matrix[i][colStart]+" ");
					al.add(matrix[i][colStart]);
				}
				colStart++;
			}
		}
		
		return al;
	}

	private static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
}
