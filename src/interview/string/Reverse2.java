package interview.string;

public class Reverse2 {
	public static void main(String[] args) {
		String s = "omkar";
		System.out.println(s);
		System.out.println(solution(s));
	}

	private static String solution(String s) {

		StringBuilder s1 = new StringBuilder();
		
		for (int i = s.length()-1; i >= 0; i--) {
			s1.append(s.charAt(i));
		}

		return s1.toString();
	}
}
