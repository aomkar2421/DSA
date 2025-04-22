package interview.recursion;

public class NthFibonacciNumber {
	public static void main(String[] args) {
		solution(2);
	}

	private static void solution(int n) {
		
		if (n==1) {
			System.out.println(0);
			return;
		}
		int a = 0;
		int b = 1;

		int num = solve(n, 2, a, b);
		System.out.println(num);
	}

	private static int solve(int n, int i, int a, int b) {
		if (i==n) {
			return b;
		}
		int c = a+b;

		return solve(n, i+1, b, c);
	}
}
