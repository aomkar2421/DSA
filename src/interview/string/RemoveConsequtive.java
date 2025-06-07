package interview.string;

//input = abbaca
//output = abaca

public class RemoveConsequtive {
	public static void main(String[] args) {
		String s = "abbaca";
		System.out.println(solution(s));
	}

	private static String solution(String s) {
		
		StringBuffer sb = new StringBuffer();
		sb.append(s.charAt(0));
		char [] ch = s.toCharArray();
		
		for (int i = 1; i < ch.length; i++) {
			char c = ch[i];
			
			if (c != sb.charAt(sb.length()-1)) {
				sb.append(c);
			}
		}
		
		return sb.toString();
	}
}
