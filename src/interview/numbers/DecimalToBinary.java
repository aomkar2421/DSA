package interview.numbers;

public class DecimalToBinary {
	public static void main(String[] args) {
		int n = 9;
		System.out.println(solution(n));
	}

	private static String solution(int n) {
		
		StringBuilder sb = new StringBuilder();
		
		int num = n;
		while (num > 0) {
			int rem = num%2;
			sb.append(rem);
			num/= 2;
		}
		
		return sb.reverse().toString();
	}
}
