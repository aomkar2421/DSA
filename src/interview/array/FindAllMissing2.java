package interview.array;

import java.util.ArrayList;

public class FindAllMissing2 {
	public static void main(String[] args) {
		int [] arr = {6,7,10,11,13};
		printArray(arr);
		System.out.println(solution(arr));
	}

	private static int[] solution(int[] arr) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i+1] - arr[i] != 1 ) {

				int cnt = arr[i+1] - arr[i] - 1;
				int j = 1;
				
				while (j <= cnt) {
					al.add(arr[i]+j);
					j++;
				}
				
			}
		}
		System.out.println(al);
		return null;
	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
