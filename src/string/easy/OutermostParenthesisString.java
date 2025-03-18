package string.easy;

public class OutermostParenthesisString {
	public static void main(String[] args) {
		String s = "(()())(())(()(()))";
		System.out.println(s);
		System.out.println(removeOuterParentheses(s));
	}
	
    public static String removeOuterParentheses(String s) {
    	
    	int bal = 0;
    	String ans = "";
    	
    	for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				if (bal > 0) {
					ans += s.charAt(i);
				}
				bal++;
			}
			else {
				bal--;
				if (bal > 0) {
					ans += s.charAt(i);
				}
			}
		}
    	
        return ans;
    } 
	
}
