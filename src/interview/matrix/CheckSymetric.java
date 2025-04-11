package interview.matrix;

public class CheckSymetric {
	public static void main(String[] args) {
		int matrix[][] = { { 1, 3, 5 }, { 3, 2, 4 }, { 5, 4, 1 } };
		printMatrix(matrix);
		System.out.println(solution(matrix));
	}

	private static boolean solution(int[][] matrix) {

		int n = matrix.length;
		int m = matrix[0].length;
		
		if (n != m) {
			return false;
		}
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				if (matrix[i][j] != matrix[j][i]) {
					return false;
				}
			}
		}
		return true;
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
