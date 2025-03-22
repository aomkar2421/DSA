package interview.numbers;

public class Factorial {
	public static void main(String[] args) {
		int n = 5;
		System.out.println(solution(n));
	}

	private static long solution(int n) {
		
		long ans = 1;
		
		for (int i = 2; i <= n; i++) {
			ans = ans * i;
		}
		
		return ans;
	}
}
