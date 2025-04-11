package interview.recursion;

public class CheckPalindrome {
	public static void main(String[] args) {
		String s = "malayalam";
		System.out.println(s);
		solution(s);
	}

	private static void solution(String s) {
		if (s.length() == 1) {
			System.out.println(s);
			return;
		}

		int i = 0;
		int j = s.length()-1;

		System.out.println(solve(s, i, j));

	}

	private static boolean solve(String s, int i, int j) {
		if (i>=j) {
			return true;
		}

		if (s.charAt(i)==s.charAt(j)) {
			return solve(s, i+1, j-1);
		}else {
			return false;

		}
	}
}
