package interview.recursion;

public class ReverseString {
	public static void main(String[] args) {
		solution("GEEKSFORGEEKS");
	}

	private static void solution(String s) {

		solve(s, 0);
		
	}

	private static void solve(String s, int i) {
		if (i >= s.length()) {
			return;
		}
		
		solve(s, i+1);
		System.out.println(s.charAt(i));
	}
}
