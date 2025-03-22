package interview.numbers;

public class DigitsSum {
	public static void main(String[] args) {
		int n = 987587;
		System.out.println(solution(n));
	}

	private static int solution(int n) {
		
		int num = n;
		int sum = 0;
		
		while (num != 0) {
			int rem = num%10;
			sum += rem;
			num /= 10;
		}
		
		return sum;
	}
}
