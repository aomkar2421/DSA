package interview.numbers;

public class PerfectNumber {
	public static void main(String[] args) {
		int n = 496;
		System.out.println(solution(n));
	}

	private static boolean solution(int n) {
		
		int sum = 1;
		
		for (int i = 2; i*i <= n; i++) {
			if (n % i == 0) {
				sum = sum + i + (n/i);
			}
		}
		
		return sum==n;
	}
}
