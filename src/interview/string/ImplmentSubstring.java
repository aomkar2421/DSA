package interview.string;


public class ImplmentSubstring {
	public static void main(String[] args) {
		String s1 = "issipi";
		String s2 = "mississipi";
		//		String s1 = "abcd";
		//		String s2 = "etabbcdabcdooabcdab";
		System.out.println(s1+" "+s2);
		System.out.println(solution(s1, s2));
	}

	private static int solution(String s1, String s2) {

		if (s1.length() > s2.length()) {
			return -1;
		}

		int start = -1;
		for (int i = 0; i <= s2.length()-s1.length(); i++) {

			start = i;
			int k = i;
			boolean flag = true;

			for (int j = 0; j < s1.length(); j++) {
				if (s1.charAt(j) == s2.charAt(k)) {
					k++;
				}else {
					flag = false;
					break;
				}
			}

			if (flag) {
				return start;
			}else {
				start = -1;
			}
		}

		return start;
	}
}
