package binarySearch.Matrix;

public class SearchIn2DArray {
	public static void main(String[] args) {
		int [][] matrix = {{1,3,5,7},{10,13,16,20},{23,30,34,60}};
		printMatrix(matrix);
		System.out.println(searchMatrix(matrix, 16));
	}

	public static boolean searchMatrix(int[][] matrix, int target) {

		int n = matrix.length;
		int m = matrix[0].length;

		for (int i = 0; i <n; i++) {

			int low = 0;
			int high = m-1;
			int mid = (low+high)/2;

			while (low <= high) {
				if (matrix[i][mid] == target) {
					return true;
				}
				else if (matrix[i][mid] < target) {
					low = mid+1;
				}
				else {
					high = mid-1;
				}
				mid = (low+high)/2;
			}

		}

		return false;
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

}
