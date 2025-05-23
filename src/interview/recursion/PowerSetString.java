package interview.recursion;

public class PowerSetString {
	public static void main(String[] args) {
		solution("abcde");
	}

	private static void solution(String s) {

		String ans = "";
		solve(s, ans, 0);
		
	}

	private static void solve(String s, String ans, int i) {
		if (i >= s.length()) {
			System.out.println(ans);
			return;
		}
		
		solve(s, ans+s.charAt(i), i+1);
		solve(s, ans, i+1);
	}
}