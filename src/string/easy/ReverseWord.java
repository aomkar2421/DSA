package string.easy;

public class ReverseWord {
	public static void main(String[] args) {
		String s = "  omkar sanjay jagtap      ";
		System.out.println(s);
		System.out.println(reverseWords(s));
	}
	
    public static String reverseWords(String s) {
    	s = s.trim();
    	int n = s.length()-1;

    	String ans = "";
    	for (int i = n; i >= 0; i--) {
			
    		if (s.charAt(i) == ' ' || i == 0) {
				int j = (i == 0) ? 0 : i+1;
				
				while (j <= n && s.charAt(j) != ' ') {
					ans += s.charAt(j);
					j++;
				}
				ans+=" ";
			}
		}
        return ans.trim();
    }
	
}
