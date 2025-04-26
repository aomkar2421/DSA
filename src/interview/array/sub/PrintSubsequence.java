package interview.array.sub;

import java.util.ArrayList;
import java.util.List;

public class PrintSubsequence {
	public static void main(String[] args) {
		int [] arr = {3,2,1};
		printArray(arr);
		System.out.println(solution(arr));
	}

	private static List<List<Integer>> solution(int[] arr) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		List<List<Integer>> res = new ArrayList<>();
		solve(0, arr, al, res);
		
		return res;
	}

	private static void solve(int i, int[] arr, ArrayList<Integer> al, List<List<Integer>> res) {
		if (i >= arr.length) {
			res.add(new ArrayList<Integer>(al));
			System.out.println(al);
			return;
		}
		
		al.add(arr[i]);
		solve(i+1, arr, al, res);
		
		al.remove(al.size()-1);
		solve(i+1, arr, al, res);
	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
