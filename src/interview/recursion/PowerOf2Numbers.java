package interview.recursion;

public class PowerOf2Numbers {
	public static void main(String[] args) {
		solution(3,4);
	}

	private static void solution(int a, int b) {

		int ans = solve(a,b,1);
		System.out.println(ans);
	}

	private static int solve(int a, int b, int ans) {
		if (b == 0) {
			return ans;
		}
		
		ans = ans*a;

		return solve(a, b-1, ans);
	}
}
