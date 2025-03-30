package interview.string;

public class ReverseWords {
	public static void main(String[] args) {
		String s = "  a good   example  ";
		System.out.println(s);
		System.out.println(solution(s));
	}

	private static String solution(String s) {

		s = s.trim();
		StringBuilder sb = new StringBuilder();
		
		int j;
		for (int i = s.length()-1; i >= 0; i--) {
			if (s.charAt(i) == ' ') {
				continue;
			}
			j = i;
			
			while (j >= 0 && s.charAt(j) != ' ') {
				j--;
			}
			
			sb.append(s.substring(j+1, i+1));
			sb.append(" ");
			i = j;
		}

		return sb.toString().trim();
	}
}
