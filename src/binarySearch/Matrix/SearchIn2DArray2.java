package binarySearch.Matrix;

public class SearchIn2DArray2 {
	public static void main(String[] args) {
		int [][] matrix = {{1,3,5,7},{10,13,16,20},{23,30,34,60}};
		printMatrix(matrix);
		System.out.println(searchMatrix(matrix, 16));
	}

	public static boolean searchMatrix(int[][] matrix, int target) {

		int n = matrix.length;
		int m = matrix[0].length;

		for (int i = 0; i <n; i++) {

			if (matrix[i][0] <= target && target <= matrix[i][m-1] ) {
				return search(matrix[i], target);
			}

		}

		return false;
	}

	private static boolean search(int[] arr, int target) {
		int n = arr.length;
		
		int low = 0;
		int high = n-1;
		int mid = (low+high)/2;

		while (low <= high) {
			if (arr[mid] == target) {
				return true;
			}
			else if (arr[mid] < target) {
				low = mid+1;
			}
			else {
				high = mid-1;
			}
			mid = (low+high)/2;
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
