package interview.numbers;

public class Armstrong {
	public static void main(String[] args) {
		int n = 1634;
		System.out.println(solution(n));
	}

	private static boolean solution(int n) {
		
		String string = Integer.toString(n);
		int pow = string.length();

		int res = 0;
		
		int num=n;
		while (num != 0) {
			int rem = num%10;
			res = res + (int) Math.pow(rem, pow);
			num = num/10;
		}
		
		return res == n;
	}
}
