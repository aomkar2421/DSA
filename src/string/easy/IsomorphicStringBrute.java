package string.easy;

public class IsomorphicStringBrute {
	public static void main(String[] args) {
		String t = "paper";
		String s = "title";
		System.out.println(s+" "+t);
		System.out.println(isIsomorphic(s, t));
	}
	
    public static boolean isIsomorphic(String s, String t) {
    	
    	if (s.length() != t.length()) {
			return false;
		}
    	
    	for (int i = 0; i < s.length(); i++) {
			for (int j = i+1; j < s.length(); j++) {
				
				if (s.charAt(i) == s.charAt(j) && t.charAt(i) != t.charAt(j) || s.charAt(i) != s.charAt(j) && t.charAt(i) == t.charAt(j) ) {
					return false;
				}
				
			}
		}
    	
    	return true;
    }
	
}
