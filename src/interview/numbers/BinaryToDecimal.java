package interview.numbers;

public class BinaryToDecimal {
	public static void main(String[] args) {
		String s = "10010010001";
		System.out.println(solution(s));
	}

	private static int solution(String b) {

		long n = Long.parseLong(b);
		long num = n;
		int i = 0;
		int ans = 0;
		while (num > 0) {
			int rem = (int) (num % 10);			
			ans = (int) (ans + (rem * Math.pow(2, i)));
			num /= 10;
			i++;
		}
		
		return ans;
	}
}
