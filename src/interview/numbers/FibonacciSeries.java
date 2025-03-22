package interview.numbers;

import java.util.ArrayList;

public class FibonacciSeries {
	public static void main(String[] args) {
		int n = 4;
		System.out.println("\n"+solution(n));
	}

	private static ArrayList<Integer> solution(int n) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		if (n <= 1) {
			for (int i = 0; i <= n; i++) {
				al.add(i);
			}
			return al;
		}
		
		int a = 0;
		int b = 1;
		al.add(a);
		al.add(b);
		
		int c=-1;

		for (int i = 2; i <= n; i++) {
			c = a + b;
			al.add(c);
			a = b;
			b = c;
		}
		
		return al;
	}
}
