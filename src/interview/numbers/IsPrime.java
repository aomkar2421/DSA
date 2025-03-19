package interview.numbers;

public class IsPrime {
	public static void main(String[] args) {
		int n = 23;
		System.out.println(solution(n));
	}

	private static boolean solution(int n) {

		if (n <= 1)
			return false;

		for (int i = 2; i*i <= n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
