package interview.numbers;

public class HappyNumber {
	public static void main(String[] args) {
		int n = 86;
		System.out.println(solution(n));
	}

	private static boolean solution(int n) {
		
		while (true) {
			if (n==1) {
				return true;
			}
			if (n==4) {
				return false;
			}
			n = calc(n);
		}
		
	}

	private static int calc(int n) {
		int res = 0;
		int num = n;
		
		while (num > 0) {
			int rem = num%10;
			res = res + rem*rem;
			num /= 10;
		}
		
		return res;
	}
}
