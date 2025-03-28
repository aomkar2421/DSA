package interview.string;

public class LongestWord {
	public static void main(String[] args) {
		String s = "A computer science portal for geeks";
		System.out.println(s);
		System.out.println(solution(s));
	}

	private static int solution(String s) {

		int j = 0;
		int maxLen = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == ' ') {
				continue;
			}
			
			j = i;
			while (j < s.length() && s.charAt(j) != ' ') {

				j++;
			}
			int len = j-i;
			maxLen = Math.max(maxLen, len);
			System.out.println(maxLen);
			i = j;
		}

		return maxLen;
	}
}
