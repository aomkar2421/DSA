package interview.matrix;

public class Transpose {
	public static void main(String[] args) {
		int [][] matrix = { {1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16} };
		printMatrix(matrix);
		solution(matrix);
	}

	private static void solution(int[][] matrix) {
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = i+1; j < matrix.length; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
		printMatrix(matrix);
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
