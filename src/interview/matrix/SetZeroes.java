package interview.matrix;

public class SetZeroes {
	public static void main(String[] args) {
		int [][] matrix = { {-5,2,3,0}, {-2,-5,-2,-5}, {-1,4,4,2}, {2,4,7,8} };
//		int [][] matrix = { {0,1,2,0}, {3,4,5,2}, {9,3,1,2}};
//		int [][] matrix = { {1,0}};
		printMatrix(matrix);
		solution(matrix);
	}

	private static void solution(int[][] matrix) {

		int n = matrix.length;
		int m = matrix[0].length;
		int idx0 = -1;
		
		//for row 0
		for (int i = 0; i < matrix[0].length; i++) {
			if (matrix[0][i] == 0) {
				idx0 = 0;
			}
		}
		
		//for col 0
		for (int i = 0; i < matrix.length; i++) {
			if (matrix[i][0] == 0) {
				matrix[0][0] = 0;
			}
		}
		
		for (int i = 1; i < n; i++) {
			for (int j = 1; j < m; j++) {
				
				if (matrix[i][j] == 0) {
					matrix[0][j] = 0;
					matrix[i][0] = 0;
				}
				
			}
		}
		
		for (int i = 1; i < n; i++) {
			for (int j = 1; j < m; j++) {
				if (matrix[i][0] == 0 || matrix[0][j] == 0) {
					matrix[i][j] = 0;
				}
			}
		}
		
		for (int i = 1; i < matrix.length; i++) {
			if (matrix[0][0] == 0) {
				matrix[i][0] = 0;
			}
		}

		for (int j = 0; j < matrix[0].length; j++) {
			if (idx0 == 0) {
				matrix[0][j] = 0;
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
