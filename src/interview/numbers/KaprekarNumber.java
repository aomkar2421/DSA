package interview.numbers;

public class KaprekarNumber {
	public static void main(String[] args) {
		System.out.println(solution(292));
	}

	private static int solution(int n) {
		
		int cnt = 0;
		int sq = n*n;
		while (sq > 0) {
			cnt++;
			sq=sq/10;
		}

		sq = n*n;
		
		for (int i = 1; i < cnt; i++) {
			
			int part = (int) Math.pow(10, i);
			
//			if (part == n) {
//				continue;
//			}
			int sum = (sq/part) + (sq%part);
			if (sum == n) {
				return 1;
			}
		}
		
		return 0;
	}
}
