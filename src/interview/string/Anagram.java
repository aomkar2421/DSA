package interview.string;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Anagram {
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

		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		
		for (char ch : s1.toCharArray()) {
			hm.put(ch, hm.getOrDefault(ch, 0)+1);
		}
		
		for (char ch : s2.toCharArray()) {
			hm.put(ch, hm.getOrDefault(ch, 0)-1);
		}
		
		for (Entry<Character, Integer> pair : hm.entrySet()) {
			if (pair.getValue() != 0) {
				return false;
			}
		}
			
		return true;
	}
}
