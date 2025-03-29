package interview.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;

public class RankCharcterFrequency {
	public static void main(String[] args) {
		String s = "GeeksForGeeks";
		System.out.println(s);
		System.out.println(solution(s));
	}

	private static String solution(String s) {
		s = s.toLowerCase();
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			hm.put(ch, hm.getOrDefault(ch, 0)+1);
		}
		
		return "";
	}
}
