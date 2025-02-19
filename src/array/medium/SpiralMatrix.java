package array.medium;

import java.util.ArrayList;

public class SpiralMatrix {
	public static void main(String[] args) {
		int [][] arr = { {1,1,1}, {1,0,1}, {1,1,0}};
		printMatrix(arr);
		spiralOrder(arr);
	}

	public static ArrayList<Integer> spiralOrder(int[][] matrix) {
		int rowStart = 0;
		int rowEnd = matrix.length-1;
		int colStart = 0;
		int colEnd = matrix[0].length-1;
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		while (rowStart <= rowEnd && colStart <= colEnd) {

			for (int i = colStart; i <= colEnd; i++) {
				al.add(matrix[rowStart][i]);
			}
			rowStart++;
			
			for (int i = rowStart; i <= rowEnd; i++) {
				al.add(matrix[i][colEnd]);
			}
			colEnd--;
			
			if (rowStart<=rowEnd) {
				for (int i = colEnd; i >= colStart; i--) {
					al.add(matrix[rowEnd][i]);
				}
				rowEnd--;
			}

			if (colStart <= colEnd) {
				for (int i = rowEnd; i >=rowStart; i--) {
					al.add(matrix[i][colStart]);
				}
				colStart++;
			}
		}		
		return al;
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
