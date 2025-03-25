package interview.string;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Anagram2 {
	public static void main(String[] args) {
		String s1 = "nagaram";
		String s2 = "anagram";
		System.out.println(s1+" "+s2);
		System.out.println(solution(s1, s2));
	}

	private static boolean solution(String s1, String s2) {
		
		if (s1.length() != s2.length()) {
			return false;
		}

		int [] freq = new int [26];
		
		for (int i = 0; i < s1.length(); i++) {
			Character ch = s1.charAt(i);
			freq[ch - 'a']++;
		}
			
		for (int i = 0; i < s1.length(); i++) {
			Character ch = s2.charAt(i);
			freq[ch - 'a']--;
		}
			
		for (int i = 0; i < s1.length(); i++) {
			Character ch = s1.charAt(i);
			if (freq[ch - 'a'] != 0) {
				return false;
			}
		}
			
		return true;
	}
}
