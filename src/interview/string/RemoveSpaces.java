package interview.string;

public class RemoveSpaces {
	public static void main(String[] args) {
		String s = "";
		System.out.println(s);
		System.out.println(solution(s));
	}

	private static String solution(String s) {

		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch != ' ') {
				sb.append(ch);
			}
		}

		return sb.toString();
	}
}
