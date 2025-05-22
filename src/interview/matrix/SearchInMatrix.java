package interview.matrix;

public class SearchInMatrix {
	public static void main(String[] args) {
		int [][] matrix = { {1,4,7,11,15}, {2,5,8,12,19}, {3,6,9,16,22}, {10,13,14,17,24}, {18,21,23,26,30} };
		printMatrix(matrix);
		System.out.println(solution(matrix, 13));
}	

	private static boolean solution(int[][] matrix, int k) {

		int n = matrix.length;
		int m = matrix[0].length;	
		
		int i = 0;
		int j = m-1;
		
		System.out.println(matrix[i][j]);
		while (i < n && j >= 0) {
			if (matrix[i][j] == k) {
				return true;
			}
			else if (k < matrix[i][j]) {
				j--;
			}
			else {
				i++;
			}
			System.out.println(matrix[i][j]);
		}
		
		return false;
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
