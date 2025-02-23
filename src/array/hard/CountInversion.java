package array.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountInversion {
	public static void main(String[] args) {
		int [][] arr = {{1,4}, {1,5}};
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
                
        return al.stream().map(l -> l.stream().mapToInt(Integer :: intValue).toArray()).toArray(int [][] :: new);
    }

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
