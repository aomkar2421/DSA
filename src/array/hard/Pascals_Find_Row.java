package array.hard;

import java.util.ArrayList;

public class Pascals_Find_Row {
	public static void main(String[] args) {
		int r = 5;
		int c = 1;
		System.out.println(findPascalRow(r));
	}

	private static ArrayList<Integer> findPascalRow(int r) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		int ans = 1;
		
		for (int i = 1; i <= r; i++) {
			System.out.println();
		}
		
		return al;
	}
	
	private static int findPascalElement(int r, int c) {
		
		int ans = 1;
		r--;
		c--;
		// as we have to calculate n-1^C^r-1 i have reduced r and c
		
		for (int i = 1; i <= c; i++) {
			ans = ans * (r);
			ans = ans / i;
			r--;
		}
		
		return ans;
	}
	
}
