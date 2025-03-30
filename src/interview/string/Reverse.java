package interview.string;

public class Reverse {
	public static void main(String[] args) {
		String s = "omkar";
		System.out.println(s);
		System.out.println(solution(s));
	}

	private static String solution(String s) {

		String s1 = "";
		
		for (int i = s.length()-1; i >= 0; i--) {
			s1+= s.charAt(i);
		}

		return s1;
	}
}
