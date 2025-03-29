package interview.string;

import java.util.HashMap;
import java.util.HashSet;

public class RemoveDuplicateLetters2 {
	public static void main(String[] args) {
		String s = "geEksforGEeks";
		System.out.println(s);
		System.out.println(solution(s));
	}

	private static String solution(String s) {

		int [] arr = new int[256];
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			
			if (arr[ch] == 0) {
				sb.append(ch);
				arr[ch]++;
			}

		}

		return sb.toString();
	}


}
