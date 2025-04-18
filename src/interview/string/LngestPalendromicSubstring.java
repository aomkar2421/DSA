package interview.string;

public class LngestPalendromicSubstring {
	public static void main(String[] args) {
		String s = "ABRBADAADAB";
		System.out.println(s);
		System.out.println(solution(s));
	}

	private static String solution(String s) {

		int n = s.length();
		int maxLen = 0;
		int start = -1;
		
		for (int i = 1; i < n; i++) {
			
			int low = i;
			int high = i;
			
			while (low >= 0 && high < n && s.charAt(low)==s.charAt(high)) {
//				System.out.println("I : "+i+" LOW : "+low+" HIGH : "+high);
//				System.out.println(s.substring(low,high+1));
				
				int len = high-low+1;
				if (len > maxLen) {
					maxLen = len;
					start = low;
					
//					System.out.println("START : "+start+" MAXLEN : "+maxLen);
//					System.out.println(s.substring(low,high+1));
				}
				low--;
				high++;
			}
			
			low = i-1;
			high = i;
			
			while (low >= 0 && high < n && s.charAt(low)==s.charAt(high)) {
//				System.out.println("I : "+i+" LOW : "+low+" HIGH : "+high);
//				System.out.println(s.substring(low,high+1));
				int len = high-low+1;
				
				if (len > maxLen) {
					maxLen = len;
					start = low;
					
//					System.out.println("START : "+start+" MAXLEN : "+maxLen);
				}
				low--;
				high++;
			}
		}
		
//		System.out.println("START : "+start+" MAXLEN : "+maxLen);
		return s.substring(start, start+maxLen);
	}
}
