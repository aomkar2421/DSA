package interview.string.sub;

public class PrintAllSubSequence {
	public static void main(String[] args) {
		solution("abcd");
	}

	private static void solution(String s) {
		String ans = "";
		solve(0, s, ans);
	}

	private static void solve(int i, String s, String ans) {
		if (i >= s.length()) {
			System.out.println(ans);
			return;
		}
		
		solve(i+1, s, ans+s.charAt(i));
		solve(i+1, s, ans);
	}
}
