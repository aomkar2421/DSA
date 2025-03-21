package interview.numbers;

import java.util.HashSet;

public class CountDigits2 {
	public static void main(String[] args) {
		int n = 2446;
		System.out.println(solution(n));
	}

	private static int solution(int n) {
		
		int num = n;

		int cnt = 0;
		
		while (num != 0) {
			int rem = num%10;
			if (rem != 0 && n % rem == 0) {
				cnt++;
			}
			num /= 10;
		}
		
		return cnt;
	}
}
