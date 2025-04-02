package interview.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinDiffernce2 {
	public static void main(String[] args) {
		int [] arr = {4,2,1,3};
		printArray(arr);
		System.out.println(solution(arr));
	}

	private static List<List<Integer>> solution(int[] arr) {

		Arrays.sort(arr);
		List<List<Integer>> al2 = new ArrayList();

		int minDif = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length-1; i++) {
			
			int dif = arr[i+1]-arr[i];
			
			if (dif == minDif) {
				al2.add(Arrays.asList(arr[i], arr[i+1]));
			}
			
			if (dif < minDif) {
				minDif = dif;
				al2.clear();
				al2.add(Arrays.asList(arr[i], arr[i+1]));
			}
		}
		return al2;
	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
