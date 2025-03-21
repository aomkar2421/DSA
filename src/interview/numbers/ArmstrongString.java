package interview.numbers;

public class ArmstrongString {
	public static void main(String[] args) {
		int n = 153;
		System.out.println(solution(n));
	}

	private static boolean solution(int n) {
		
		String string = Integer.toString(n);
		int order = string.length();

		int res = 0;
		for (char ch : string.toCharArray()) {
			res = (int) (res + Math.pow(ch - '0', order));
		}
		System.out.println(res);
		return res == n;
	}
}
