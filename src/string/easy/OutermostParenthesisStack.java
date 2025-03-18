package string.easy;

import java.util.Stack;

public class OutermostParenthesisStack {
	public static void main(String[] args) {
		String s = "(()())(())(()(()))";
		System.out.println(s);
		System.out.println(removeOuterParentheses(s));
	}
	
    public static String removeOuterParentheses(String s) {
    	
    	Stack<Character> st = new Stack<Character>();
    	String ans = "";
    	
    	for (int i = 0; i < s.length(); i++) {
    		char c = s.charAt(i);
    		
			if (c == '(') {
				if (!st.isEmpty()) {
					ans += c;
				}
				st.push(c);
			}
			else {
				st.pop();
				if (!st.isEmpty()) {
					ans += c;
				}
			}
		}
    	
        return ans;
    } 
	
}
