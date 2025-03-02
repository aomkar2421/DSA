package array.hard;

import java.util.ArrayList;

public class FindPascalTriangle {
	public static void main(String[] args) {
		int r = 7;
		System.out.println(generate(r));
	}

	private static ArrayList<ArrayList<Integer>> generate(int r) {
		
		ArrayList<ArrayList<Integer>> triangle = new ArrayList<ArrayList<Integer>>();
		
		for (int i = 1; i <= r; i++) {
			triangle.add(findPascalRow(i));
		}
		
		return triangle;
	}

	private static ArrayList<Integer> findPascalRow(int r) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		int ans = 1;
		al.add(ans);
		
		int n = --r;
		
		for (int i = 1; i <= r; i++) {
			ans = ans * n;
			ans = ans / i;
			al.add(ans);
			n--;
		}
		
		return al;
	}
	
}
