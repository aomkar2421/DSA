package array.hard;

import java.util.ArrayList;

public class Pascals_Find_Element {
	public static void main(String[] args) {
		int r =9;
		System.out.println(findPascalRow(r));
	}

	private static ArrayList<Integer> findPascalRow(int r) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for (int i = 1; i <= r; i++) {
			al.add(findPascalElement(r, i));
		}
		
		return al;
	}

	private static int findPascalElement(int r, int c) {
		
		int ans = 1;
		r--;
		c--;
		// as we have to calculate n-1^C^r-1 i have reduced r and c
		
		for (int i = 1; i <= c; i++) {
			ans = ans * r;
			ans = ans / i;
			r--;
		}
		
		return ans;
	}
}
