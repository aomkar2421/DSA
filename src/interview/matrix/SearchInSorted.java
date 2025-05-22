package interview.matrix;

public class SearchInSorted {
	public static void main(String[] args) {
		int [][] matrix = { {1,2,3,4}, {5,6,7,8}, {9,10,11,12} };
		printMatrix(matrix);
		System.out.println(solution(matrix, 13));
	}

	private static boolean solution(int[][] matrix, int k) {

		int n = matrix.length;
		int m = matrix[0].length;
		
		int low = 0;
		int high = m*n-1;
		int mid = (low+high)/2;

		while (low <= high) {
			
			int row = mid/m;
			int col = mid%m;
			System.out.println(mid+" "+row+" "+col+" ");
				if (matrix[row][col] == k) {
				return true;
			}
			else if (matrix[row][col] > k) {
				high = mid-1;
			}
			else {
				low = mid+1;
			}
			mid = (low+high)/2;
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
