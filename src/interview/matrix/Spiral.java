package interview.matrix;

import java.util.ArrayList;

public class Spiral {
	public static void main(String[] args) {
		//		int [][] matrix = { {1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16} };
		int [][] matrix = { {1,2,3,4}, {5,6,7,8}, {9,10,11,12} };
		printMatrix(matrix);
		solution(matrix);
	}

	private static ArrayList<Integer> solution(int[][] matrix) {

		int top = 0;
		int right = matrix[0].length-1;
		int bottom = matrix.length-1;
		int left = 0;
		ArrayList<Integer> al = new ArrayList<Integer>();

		while (top <= bottom && left <= right) {

			for (int i = left; i <= right; i++) {
				al.add(matrix[top][i]);
			}
			top++;

			for (int i = top; i <= bottom; i++) {
				al.add(matrix[i][right]);
			}
			right--;

			if (top <= bottom) {				
				for (int i = right; i >= left; i--) {
					al.add(matrix[bottom][i]);
				}
			}
			bottom--;

			if (left <= right) {				
				for (int i = bottom; i >= top; i--) {
					al.add(matrix[i][left]);
				}
			}
			left++;
		}
		return al;
	}

	private static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
}
