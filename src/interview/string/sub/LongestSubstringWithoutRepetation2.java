package interview.string.sub;

import java.util.HashSet;

public class LongestSubstringWithoutRepetation2 {
	public static void main(String[] args) {
		System.out.println(solution("  "));
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

		while (right < s.length()) {

			while (vis[s.charAt(right)-'a']) {
				vis[s.charAt(left)-'a'] = false;
				left++;
			}

			
			int len = right-left+1;
			if (len > maxLen) {
				maxLen = len;
				resStart = left;
				resEnd = right;
			}
			vis[s.charAt(right)-'a'] = true;

			right++;
		}

		System.out.println(s.substring(resStart, resEnd+1));
		System.out.println(resStart+" "+resEnd);
		System.out.println(maxLen);
		return maxLen;
	}
}
