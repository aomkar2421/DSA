package interview.numbers;

public class NthFibonacci {
	public static void main(String[] args) {
		int n = 5;
		System.out.println(solution(n));
	}

	private static int solution(int n) {
		if (n <= 1) {
			return n;
		}
		
		int a = 0;
		int b = 1;
		int c=-1;

		for (int i = 2; i <= n; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		
		return c;
	}
}
