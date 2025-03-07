package array.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntFunction;

public class OverLappingIntervalsOptimal {
	public static void main(String[] args) {
		int [][] arr = { {1,3}, {8,9}, {2,6}, {2,4}, {15,18}, {9,10}, {16,17}};
		printMatrix(arr);
		merge(arr);
	}
	
	public static int[][] merge(int[][] arr) {
        List<List<Integer>> al = new ArrayList<>();
        
        Arrays.sort(arr, (a,b) -> Integer.compare(a[0], b[0]) );
        
        for (int i = 0; i < arr.length; i++) {
			if (al.isEmpty() || arr[i][0] > al.get(al.size()-1).get(1)) {
				al.add(Arrays.asList(arr[i][0], arr[i][1]));
			}else {
				al.get( al.size()-1  ).set(1, Math.max(al.get(al.size()-1).get(1), arr[i][1] ));
			}
		}
        
        System.out.println(al);
        return al.stream().map(l -> l.stream().mapToInt(Integer :: intValue).toArray()).toArray(int [][] :: new);
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
