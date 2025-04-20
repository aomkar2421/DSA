package interview.string.sub;

public class LongestSubstringWithoutRepetation {
	public static void main(String[] args) {
		solution("abcdefabcbb");
	}

	private static void solution(String s) {

		int res=0;
		int resStart = 0;
		int resEnd = 0;
				
		for (int i = 0; i < s.length(); i++) {
			boolean [] vis = new boolean[26];
			for (int j = i; j < s.length(); j++) {
				
				if (vis[s.charAt(j)-'a'] == true) {
					break;
				}
				else {
					int len = j-i+1;
					if (len > res) {
						res = len;
						resStart = i;
						resEnd = j;
					}
					vis[s.charAt(j) - 'a'] = true;
				}
				
			}
		}
		System.out.println(s.substring(resStart, resEnd+1));
		System.out.println(res);
	}
}
