package interview.numbers;

public class ReverseNumber {
	public static void main(String[] args) {
		int n = -96757;
		System.out.println(n);
		System.out.println(solution(n));
	}

	private static int solution(int n) {
		
		int num = n;
		int res = 0;
		
		while (num != 0) {
			int rem = num%10;
			res = res*10 + rem;
			num = num/10;
		}
		
		return res;
	}
}
