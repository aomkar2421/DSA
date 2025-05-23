package interview.recursion;

public class SumOfDigits {
	public static void main(String[] args) {
		solution(19736);
	}

	private static void solution(int n) {

		int ans = solve(n, 0);
		System.out.println(ans);
	}

	private static int solve(int n, int sum) {
		if (n <= 0) {
			return sum;
		}
		
		int rem = n%10;
		sum = sum+rem;
		
		return solve(n/10, sum);
	}
}
