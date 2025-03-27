package interview.string;

public class ShuffleSubString {
	public static void main(String[] args) {
		String s1 = "abch";
		String s2 = "defm";
		String s3 = "ahm";
		System.out.println(s1+" "+s2+" "+s3);
		System.out.println(solution(s1, s2, s3));
	}

	private static boolean solution(String s1, String s2, String s3) {
		
		int [] freq = new int [26];
		
		for (int i = 0; i < s1.length(); i++) {
			char ch = s1.charAt(i);
			freq[ch - 'a']++;
		}
			
		for (int i = 0; i < s2.length(); i++) {
			char ch = s2.charAt(i);
			freq[ch - 'a']++;
		}
			
		for (int i = 0; i < s3.length(); i++) {
			char ch = s3.charAt(i);
			if (freq[ch - 'a'] == 0) {
				return false;
			}
		}
			
		return true;
	}
}
