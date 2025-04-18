package interview.array.sub;

import java.util.HashSet;

public class LongestSequence {
	public static void main(String[] args) {
		int [] arr = {100,4,200,1,3,2};
		printArray(arr);
		System.out.println(solution(arr));
	}

	private static int solution(int[] arr) {

		HashSet<Integer> hs = new HashSet<Integer>();
		
		for (int val : arr) {
			hs.add(val);
		}
		
		int res = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (hs.contains(arr[i]) && !hs.contains(arr[i]-1)) {
				int cnt = 1;
				int val = arr[i]+1;
				while (hs.contains(val)) {
					cnt++;
					val++;
				}
				res = Math.max(cnt, res);
			}
		}
		
		return res;
	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
