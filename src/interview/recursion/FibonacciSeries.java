package interview.recursion;

public class FibonacciSeries {
	public static void main(String[] args) {
		solution(10);
	}

	private static void solution(int n) {

		int a = 0;
		int b = 1;
		System.out.print(a+" "+b);
		solve(n, 2, a, b); // as we need to print 10 but we already have printed 2 hence 2 is passed 
		
	}

	private static void solve(int n, int i, int a, int b) {
		if (i==n) {
			return;
		}
		int c = a+b;
		System.out.print(" "+c);
		solve(n, i+1, b, c);
	}
}
