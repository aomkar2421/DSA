package array.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OverLappingIntervalsBrute {
	public static void main(String[] args) {
		int [][] arr = { {1,3}, {8,9}, {2,6}, {2,4}, {15,18}, {9,10}, {16,17}};
		printMatrix(arr);
		merge(arr);
	}
	
	public static List<List<Integer>> merge(int[][] arr) {
        List<List<Integer>> al = new ArrayList<>();
        
        Arrays.sort(arr, (a,b) -> Integer.compare(a[0], b[0]) );
        
        for (int i = 0; i < arr.length; i++) {
			int start = arr[i][0];
			int end = arr[i][1];
			
			if (!al.isEmpty() && end <= al.get( al.size() -1 ).get(1)) {
				continue;
			}
			
			for (int j = i+1; j < arr.length; j++) {
				if (arr[j][0] < end) {
					end = Math.max(end, arr[j][1]);
                } else {
                    break;
                }
			}
			al.add(Arrays.asList(start, end));
		}
        
        printMatrix(arr);
        
        return al;
    }

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
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
