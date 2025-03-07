package array.hard;

import java.util.ArrayList;

public class Pascals_Find_Row2 {
	public static void main(String[] args) {
		int r = 7;
		System.out.println(findPascalRow(r));
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
