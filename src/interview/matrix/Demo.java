package interview.matrix;

public class Demo {
	public static void main(String[] args) {
		int [][] matrix = { {1,2,3,4}, {5,6,7,8}, {9,10,11,12} };
		printMatrix(matrix);
		solution(matrix);
	}

	private static void solution(int[][] matrix) {

		
		
	}

	public static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
}
