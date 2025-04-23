package string.medium;

import java.util.Stack;

public class ParenthesisMaxDeapth {
	public static void main(String[] args) {
		String s = "()(())((()(())))";
		System.out.println(solution(s));
	}

	private static int solution(String s) {
		
		int maxLen = 0;
		Stack<Character> st = new Stack<Character>();
		
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			
			if (ch == '(') {
				st.push(ch);
				maxLen = Math.max(maxLen, st.size());
			}else if (ch == ')') {
				st.pop();
			}
		}
		
		return maxLen;
	}
}
