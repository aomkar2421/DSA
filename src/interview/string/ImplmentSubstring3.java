package interview.string;


public class ImplmentSubstring3 {
	public static void main(String[] args) {
		String s1 = "issippi";
		String s2 = "mississippi";
		//		String s1 = "abcd";
		//		String s2 = "etabbcdabcdooabcdab";
		System.out.println(s1+" "+s2);
		System.out.println(solution(s1, s2));
	}

	private static int solution(String s1, String s2) {

		if (s1.length() > s2.length()) {
			return -1;
		}

		for (int i = 0; i <= s2.length()-s1.length(); i++) {
			if (s2.substring(i, i+s1.length()).equals(s1)) {
				return i;
			}
		}

		return -1;
	}
}
