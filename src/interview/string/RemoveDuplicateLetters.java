package interview.string;

import java.util.HashMap;
import java.util.HashSet;

public class RemoveDuplicateLetters {
	public static void main(String[] args) {
		String s = "geEksforGEeks";
		System.out.println(s);
		System.out.println(solution(s));
	}

	private static String solution(String s) {

		HashSet<Character> hs = new HashSet<Character>();
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			
			if (!hs.contains(ch)) {
				sb.append(ch);
				hs.add(ch);
			}
			
		}

		return sb.toString();
	}


}
