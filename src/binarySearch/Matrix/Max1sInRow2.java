package binarySearch.Matrix;

public class Max1sInRow2 {
	public static void main(String[] args) {
		int [][] matrix = {{0,1,1,1},{0,0,0,0},{1,1,1,1},{0,1,1,1}};
		printMatrix(matrix);
		System.out.println(rowWithMax1s(matrix));
	}

    public static int rowWithMax1s(int arr[][]) {
    	
    	int n = arr.length;
    	int m = arr[0].length;
    	
    	int maxCount = -1;
    	int idx = -1;
    	
    	for (int i = 0; i < arr.length; i++) {
    		
    		int count = firstOccurance(arr[i], 1);

    		if (maxCount < count) {
    			maxCount = count;
    			idx = i;
    		}
    		
		}
    	
        return idx;
    }

	private static int firstOccurance(int[] arr, int i) {
		int m = arr.length;
		
		int low = 0;
		int high = m-1;
		int mid = (low+high)/2;
		
		int index1 = m;
		
		while (low <= high) {
			
			if (arr[mid] >= 1 ) {
				index1 = mid;
				high = mid-1;
			}
			else {
				low = mid+1;
			}
			mid = (low+high)/2;
		}
		
		int count = m-index1;
		return count;
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
