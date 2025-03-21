package interview.numbers;

public class CountDigits {
	public static void main(String[] args) {
		int n = 987587;
		System.out.println(solution(n));
	}

	private static int solution(int n) {
		
		int num = n;
		int cnt = 0;
		
		while (num != 0) {
			num/=10;
			cnt++;
		}
		
		return cnt;
	}
}
