package interview.string.sub;

import java.util.HashSet;

public class LongestSubstringWithoutRepetation3 {
	public static void main(String[] args) {
		System.out.println(solution("abcabcbb"));
	}

	private static int solution(String s) {

		if(s.length() <= 1){
			return s.length();
		}

		int res=0;
		int resStart = 0;
		int resEnd = 0;

		int right = 0;
		int left = 0;

		int maxLen = 0;

		boolean [] vis = new boolean[26];
		HashSet<Character> hs = new HashSet<Character>();

		while (right < s.length()) {

			while (hs.contains(s.charAt(right))) {
				hs.remove(s.charAt(left));
				left++;
			}

			int len = right-left+1;
			if (len > maxLen) {
				maxLen = len;
				resStart = left;
				resEnd = right;
			}
			hs.add(s.charAt(right));

			right++;
		}

		System.out.println(s.substring(resStart, resEnd+1));
		System.out.println(resStart+" "+resEnd);
		System.out.println(maxLen);
		return maxLen;
	}
}
