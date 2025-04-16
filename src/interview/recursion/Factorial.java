package interview.recursion;

public class Factorial {
	public static void main(String[] args) {
		solution(5);
	}

	private static void solution(int n) {

		int fact =1;
		System.out.println(solve(n, fact));
	}

	private static int solve(int n, int fact) {
		if (n == 1) {
			return fact;
		}
		fact = fact*n;
		return solve(n-1, fact);
	}
}