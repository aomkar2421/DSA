package interview.string;

public class FirstNonRepeating {
	public static void main(String[] args) {
		String s = "geeksforgeeks";
		System.out.println(s);
		System.out.println(solution(s));
	}

	private static char solution(String s) {

		int [] visited = new int [26];

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			visited[ch - 'a']++;

		}

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (visited[ch - 'a'] == 1) {
				return ch;
			}
		}

		return '$';
	}
}
