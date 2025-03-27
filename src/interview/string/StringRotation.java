package interview.string;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class StringRotation {
	public static void main(String[] args) {
		String s1 = "aab";
		String s2 = "aba";
		System.out.println(s1+" "+s2);
		System.out.println(solution(s1, s2));
	}

	private static boolean solution(String s1, String s2) {
		
		if (s1.length() != s2.length()) {
			return false;
		}

		for (int i = 0; i < s1.length(); i++) {
			if (s1.equals(s2)) {
				return true;
			}
			
			System.out.print("S1 BEFORE : "+s1);
			int len = s1.length();
			char last = s1.charAt(len-1);
			s1 = last + s1.substring(0, len-1);
			System.out.println(" S1 AFTER : "+s1);
		}
			
		return false;
	}
}
